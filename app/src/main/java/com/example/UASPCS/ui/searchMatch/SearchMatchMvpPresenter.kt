package com.ahmaddudayef.UASPCS.ui.searchMatch

import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter


interface SearchMatchMvpPresenter<V: SearchMatchMvpView> : MvpPresenter<V> {
    fun searchMatch(query: String?)
}