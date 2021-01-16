package com.ahmaddudayef.UASPCS.ui.favoriteteam

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class FavoriteTeamModule {

    @Provides
    fun provideFavoriteTeamMvpPresenter(presenter: FavoriteTeamPresenter<FavoriteTeamMvpView>): FavoriteTeamMvpPresenter<FavoriteTeamMvpView> {
        return presenter
    }

    @Provides
    fun provideGridLayoutManager(@ApplicationContext context: Context): GridLayoutManager {
        return GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
    }
}