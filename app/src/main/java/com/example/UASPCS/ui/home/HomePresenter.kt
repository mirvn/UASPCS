package com.ahmaddudayef.UASPCS.ui.home

import com.ahmaddudayef.UASPCS.data.DataManager
import com.ahmaddudayef.UASPCS.ui.base.BasePresenter
import com.ahmaddudayef.UASPCS.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter<V: HomeMvpView> @Inject constructor(
        private val dataManager: DataManager,
        private val compositeDisposable: CompositeDisposable,
        private val subscriber: SchedulerProvider
): BasePresenter<V>(dataManager, compositeDisposable, subscriber), HomeMvpPresenter<V>