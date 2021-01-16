package com.ahmaddudayef.UASPCS.ui.infoteam

import dagger.Module
import dagger.Provides


@Module
class InfoTeamModule{
    @Provides
    fun provideInfoTeamMvpPresenter(presenter: InfoTeamPresenter<InfoTeamMvpView>): InfoTeamMvpPresenter<InfoTeamMvpView>{
        return presenter
    }
}