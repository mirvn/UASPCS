package com.ahmaddudayef.UASPCS.ui.teams

import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter

interface TeamMvpPresenter<V: TeamMvpView>: MvpPresenter<V> {
    fun getTeamList(leagueId: String)
    fun getAllLeagues()
}