package com.ahmaddudayef.UASPCS.ui.searchMatch

import com.ahmaddudayef.UASPCS.data.network.model.schedule.EventsItem
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface SearchMatchMvpView : MvpView {
    fun updateSearchMatch(listMatch: MutableList<EventsItem>)
}