package com.ahmaddudayef.UASPCS.ui.searchTeam

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import com.ahmaddudayef.UASPCS.ui.teams.TeamAdapter
import dagger.Module
import dagger.Provides


@Module
class SearchTeamModule {

    @Provides
    fun provideSearchTeamMvpPresenter(presenter: SearchTeamPresenter<SearchTeamMvpView>): SearchTeamMvpPresenter<SearchTeamMvpView> {
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