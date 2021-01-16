package com.ahmaddudayef.UASPCS.ui.detailplayer

import dagger.Module
import dagger.Provides


@Module
class DetailPlayerModule {

    @Provides
    fun provideDetailPlayerMvpPresenter(presenter: DetailPlayerPresenter<DetailPlayerMvpView>): DetailPlayerMvpPresenter<DetailPlayerMvpView>{
        return presenter
    }
}