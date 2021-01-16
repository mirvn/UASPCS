package com.ahmaddudayef.UASPCS.ui.player

import com.ahmaddudayef.UASPCS.data.network.model.player.Player
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface PlayerMvpView : MvpView {
    fun updateListPlayer(listPlayer: MutableList<Player>)
}