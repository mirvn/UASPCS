package com.ahmaddudayef.UASPCS.ui.favoriteplayer

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class FavoritePlayerModule {

    @Provides
    fun provideFavoritePlayerMvpPresenter(presenter: FavoritePlayerPresenter<FavoritePlayerMvpView>): FavoritePlayerMvpPresenter<FavoritePlayerMvpView> {
        return presenter
    }

    @Provides
    fun provideGridLayoutManager(@ApplicationContext context: Context): GridLayoutManager {
        return GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
    }
}