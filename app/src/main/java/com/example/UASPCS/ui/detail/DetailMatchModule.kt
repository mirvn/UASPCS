package com.ahmaddudayef.UASPCS.ui.detail

import dagger.Module
import dagger.Provides

@Module
class DetailMatchModule {

    @Provides
    fun provideDetailMatchMvpPresenter(presenter: DetailMatchPresenter<DetailMatchMvpView>): DetailMatchMvpPresenter<DetailMatchMvpView>{
        return presenter
    }
}