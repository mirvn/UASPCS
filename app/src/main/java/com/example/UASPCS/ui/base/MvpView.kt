package com.ahmaddudayef.UASPCS.ui.base


interface MvpView {
    fun showLoading()
    fun hideLoading()
    fun showMessage(message: String)
    fun showError(message: String)
}