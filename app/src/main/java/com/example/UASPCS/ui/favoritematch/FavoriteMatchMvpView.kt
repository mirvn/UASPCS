package com.ahmaddudayef.UASPCS.ui.favoritematch

import com.ahmaddudayef.UASPCS.data.network.model.schedule.Events
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface FavoriteMatchMvpView : MvpView {
    fun showMatchFavorite(matches: Events)
}