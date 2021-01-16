package com.ahmaddudayef.UASPCS.ui.player

import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface PlayerMvpPresenter<V: PlayerMvpView>: MvpPresenter<V> {
    fun getPlayerList(teamId: String)
}