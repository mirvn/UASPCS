package com.ahmaddudayef.UASPCS.ui.prevmatch

import com.ahmaddudayef.UASPCS.data.DataManager
import com.ahmaddudayef.UASPCS.ui.base.BasePresenter
import com.ahmaddudayef.UASPCS.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber
import javax.inject.Inject


class PrevPresenter<V: PrevMvpView> @Inject constructor(
        private val dataManager: DataManager,
        private val compositeDisposable: CompositeDisposable,
        private val subscriber: SchedulerProvider
): BasePresenter<V>(dataManager, compositeDisposable, subscriber), PrevMvpPresenter<V> {

    override fun getPrevScheduleList(leagueId: String) {
        mvpView?.showLoading()
        compositeDisposable.add(
                dataManager.getLastSchedule(leagueId)
                        .subscribeOn(subscriber.io())
                        .observeOn(subscriber.mainThread())
                        .subscribe({ results ->
                            if (!isViewAttached())
                                return@subscribe
                            mvpView?.hideLoading()
                            if (results.events != null){
                                mvpView?.updateList(results.events!!)
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

    override fun getAllLeagues() {
        mvpView?.showLoading()
        compositeDisposable.add(
                dataManager.getAllLeagues()
                        .subscribeOn(subscriber.io())
                        .observeOn(subscriber.mainThread())
                        .subscribe({ results ->
                            if (!isViewAttached())
                                return@subscribe
                            mvpView?.hideLoading()
                            mvpView?.updateLeagueid(results)
                        }, { throwable ->
                            if (!isViewAttached())
                                return@subscribe

                            mvpView?.hideLoading()
                            mvpView?.showMessage(throwable.message!!)
                            Timber.e(throwable.message)
                        })
        )
    }

}