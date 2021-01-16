package com.ahmaddudayef.UASPCS.ui.detailplayer

import android.content.Context
import com.ahmaddudayef.UASPCS.data.network.model.player.Player
import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface DetailPlayerMvpPresenter<V: DetailPlayerMvpView>: MvpPresenter<V> {
    fun addToFavorite(context: Context, player: Player)
    fun removeFavorite(context: Context, id: String)
}