package com.ahmaddudayef.UASPCS.ui.favoriteplayer

import android.content.Context
import com.ahmaddudayef.UASPCS.data.db.entities.PlayerEntity
import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter
import io.reactivex.Single


interface FavoritePlayerMvpPresenter<V: FavoritePlayerMvpView>: MvpPresenter<V> {
    fun getPlayerFavorite(context: Context?): Single<List<PlayerEntity>>
    fun getPlayer(context: Context?)
}