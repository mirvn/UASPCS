package com.ahmaddudayef.UASPCS.ui.searchTeam

import com.ahmaddudayef.UASPCS.data.network.model.team.Team
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface SearchTeamMvpView : MvpView {
    fun updateSearchTeam(listTeam: MutableList<Team>)
}