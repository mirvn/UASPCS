package com.ahmaddudayef.UASPCS.ui.base


interface MvpPresenter<V: MvpView> {

    fun onAttach(mvpView: V)

    fun onDetach()
}