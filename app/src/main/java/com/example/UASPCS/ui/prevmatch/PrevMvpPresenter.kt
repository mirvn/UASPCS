package com.ahmaddudayef.UASPCS.ui.prevmatch

import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface PrevMvpPresenter<V: PrevMvpView>: MvpPresenter<V> {
    fun getPrevScheduleList(leagueId: String)
    fun getAllLeagues()
}