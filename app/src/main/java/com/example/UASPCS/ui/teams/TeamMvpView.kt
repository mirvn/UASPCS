package com.ahmaddudayef.UASPCS.ui.teams

import com.ahmaddudayef.UASPCS.data.network.model.league.Leagues
import com.ahmaddudayef.UASPCS.data.network.model.team.Team
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface TeamMvpView : MvpView {
    fun updateListTeam(listTeam: MutableList<Team>)
    fun updateLeagueId(leagues: Leagues)
}