package com.ahmaddudayef.UASPCS.ui.detail

import com.ahmaddudayef.UASPCS.ui.base.MvpView


interface DetailMatchMvpView : MvpView {
    fun showDetailMatch(homeBadge: String, awayBadge: String)
}