package com.ahmaddudayef.UASPCS.ui.matches

import dagger.Module
import dagger.Provides


@Module
class MatchModule {
    @Provides
    fun provideMatchMvpPresenter(presenter: MatchPresenter<MatchMvpView>): MatchMvpPresenter<MatchMvpView>{
        return presenter
    }
}