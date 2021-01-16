package com.ahmaddudayef.UASPCS.ui.detailteam

import android.content.Context
import com.ahmaddudayef.UASPCS.data.network.model.team.Team
import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface DetailTeamMvpPresenter<V: DetailTeamMvpView>: MvpPresenter<V> {
    fun addToFavorite(context: Context, team: Team)
    fun removeFavorite(context: Context, id: String)
}