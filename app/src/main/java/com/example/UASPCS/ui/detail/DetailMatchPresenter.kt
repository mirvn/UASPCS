package com.ahmaddudayef.UASPCS.ui.detail

import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import com.ahmaddudayef.UASPCS.data.DataManager
import com.ahmaddudayef.UASPCS.data.db.database
import com.ahmaddudayef.UASPCS.data.db.entities.MatchEntity
import com.ahmaddudayef.UASPCS.data.network.model.schedule.EventsItem
import com.ahmaddudayef.UASPCS.data.network.model.team.TeamResponse
import com.ahmaddudayef.UASPCS.ui.base.BasePresenter
import com.ahmaddudayef.UASPCS.utils.rx.SchedulerProvider
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.BiFunction
import org.jetbrains.anko.db.delete
import org.jetbrains.anko.db.insert
import timber.log.Timber
import javax.inject.Inject


class DetailMatchPresenter<V: DetailMatchMvpView> @Inject constructor(
        private val dataManager: DataManager,
        private val compositeDisposable: CompositeDisposable,
        private val subscriber: SchedulerProvider
): BasePresenter<V>(dataManager, compositeDisposable, subscriber), DetailMatchMvpPresenter<V> {

    override fun getTeamsBadge(homeBadge: String, awayBadge: String) {
        mvpView?.showLoading()
        compositeDisposable.add(
                Single.zip(
                        dataManager.getDetailTeam(homeBadge),
                        dataManager.getDetailTeam(awayBadge),
                        BiFunction<TeamResponse, TeamResponse, List<String>> { t1, t2 ->
                            listOf(t1.teams?.get(0)!!.strTeamBadge, t2.teams?.get(0)!!.strTeamBadge)
                        })
                        .subscribeOn(subscriber.io())
                        .observeOn(subscriber.mainThread())
                        .subscribe({ logoClub ->
                            run {
                                if (!isViewAttached())
                                    return@subscribe
                                mvpView?.hideLoading()
                                if (logoClub != null)
                                    mvpView?.showDetailMatch(logoClub[0], logoClub[1])
                            }
                        }, { throwable ->
                            if (!isViewAttached())
                                return@subscribe
                            mvpView?.hideLoading()
                            mvpView?.showMessage(throwable.message!!)
                            Timber.e(throwable.message)
                        })

        )
    }

    override fun addToFavorite(context: Context, match: EventsItem) {
        try {
            context.database.use {
                insert(MatchEntity.TABLE_MATCH,
                        MatchEntity.EVENT_ID to match.idEvent,
                        MatchEntity.MATCH_HOME_ID to match.idHomeTeam,
                        MatchEntity.MATCH_AWAY_ID to match.idAwayTeam)
            }
            mvpView?.showMessage("Added to Favorite Match")
        } catch (e: SQLiteConstraintException) {
            mvpView?.showError(e.localizedMessage)
        }
    }

    override fun removeFromFavorite(context: Context, id: String) {
        try {
            context.database.use {
                delete(MatchEntity.TABLE_MATCH, "(EVENT_ID = {id})", "id" to id)
            }
            mvpView?.showMessage("Removed from favorite match")
        } catch (e: SQLiteConstraintException) {
            mvpView?.showError(e.localizedMessage)
        }
    }
}