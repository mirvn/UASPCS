package com.ahmaddudayef.UASPCS.ui.nextmatch

import com.ahmaddudayef.UASPCS.data.network.model.league.Leagues
import com.ahmaddudayef.UASPCS.data.network.model.schedule.EventsItem
import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface NextMvpView : MvpView {
    fun updateList(listTeam: MutableList<EventsItem>)
    fun updateLeagueid(leagues: Leagues)
}