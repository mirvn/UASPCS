package com.ahmaddudayef.UASPCS.ui.searchMatch

import com.ahmaddudayef.UASPCS.data.DataManager
import com.ahmaddudayef.UASPCS.ui.base.BasePresenter
import com.ahmaddudayef.UASPCS.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber
import javax.inject.Inject


class SearchMatchPresenter<V: SearchMatchMvpView> @Inject constructor(
        private val dataManager: DataManager,
        private val compositeDisposable: CompositeDisposable,
        private val subscriber: SchedulerProvider
): BasePresenter<V>(dataManager, compositeDisposable, subscriber), SearchMatchMvpPresenter<V> {

    override fun searchMatch(query: String?) {
        mvpView?.showLoading()
        compositeDisposable.add(
                dataManager.searchMatches(query)
                        .subscribeOn(subscriber.io())
                        .observeOn(subscriber.mainThread())
                        .subscribe({ results ->
                            if (!isViewAttached())
                                return@subscribe
                            mvpView?.hideLoading()
                            mvpView?.updateSearchMatch(results.events)
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