package com.ahmaddudayef.UASPCS.ui.teams

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class TeamModule {

    @Provides
    fun provideTeamMvpPresenter(presenter: TeamPresenter<TeamMvpView>): TeamMvpPresenter<TeamMvpView>{
        return presenter
    }

    @Provides
    fun provideGridLayoutManager(@ApplicationContext context: Context): GridLayoutManager {
        return GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
    }

    @Provides
    fun provideTeamAdapter(): TeamAdapter {
        return TeamAdapter(ArrayList())
    }


}