package com.ahmaddudayef.UASPCS.ui.searchTeam

import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter

interface SearchTeamMvpPresenter<V: SearchTeamMvpView>: MvpPresenter<V> {
    fun searchTeam(query: String?)
}