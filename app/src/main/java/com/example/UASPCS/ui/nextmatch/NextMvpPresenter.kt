package com.ahmaddudayef.UASPCS.ui.nextmatch

import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface NextMvpPresenter<V: NextMvpView>: MvpPresenter<V> {
    fun getNextScheduleList(leagueId: String)
    fun getAllLeagues()
}