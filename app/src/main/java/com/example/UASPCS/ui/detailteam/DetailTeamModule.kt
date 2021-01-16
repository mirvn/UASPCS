package com.ahmaddudayef.UASPCS.ui.detailteam

import dagger.Module
import dagger.Provides


@Module
class DetailTeamModule {
    @Provides
    fun provideDetailTeamPresenter(presenter: DetailTeamPresenter<DetailTeamMvpView>): DetailTeamMvpPresenter<DetailTeamMvpView>{
        return presenter
    }
}