package com.ahmaddudayef.UASPCS.ui.detail

import android.content.Context
import com.ahmaddudayef.UASPCS.data.network.model.schedule.EventsItem
import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface DetailMatchMvpPresenter<V: DetailMatchMvpView>: MvpPresenter<V> {
    fun getTeamsBadge(homeBadge: String, awayBadge: String)
    fun addToFavorite(context: Context, match: EventsItem)
    fun removeFromFavorite(context: Context, id: String)
}