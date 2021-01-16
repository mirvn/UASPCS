package com.ahmaddudayef.UASPCS.ui.favoriteteam

import com.ahmaddudayef.UASPCS.data.network.model.team.TeamResponse
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface FavoriteTeamMvpView : MvpView {
    fun showTeamFavorite(teams: TeamResponse)
}