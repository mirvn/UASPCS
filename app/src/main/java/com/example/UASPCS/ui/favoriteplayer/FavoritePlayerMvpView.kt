package com.ahmaddudayef.UASPCS.ui.favoriteplayer

import com.ahmaddudayef.UASPCS.data.network.model.player.FavoritePlayers
import com.ahmaddudayef.UASPCS.ui.base.MvpView

interface FavoritePlayerMvpView : MvpView {
    fun showPlayerFavorite(players: FavoritePlayers)
}