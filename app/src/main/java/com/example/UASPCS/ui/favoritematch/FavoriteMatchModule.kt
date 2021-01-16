package com.ahmaddudayef.UASPCS.ui.favoritematch

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class FavoriteMatchModule {

    @Provides
    fun provideFavoriteMatchMvpPresenter(presenter: FavoriteMatchPresenter<FavoriteMatchMvpView>): FavoriteMatchMvpPresenter<FavoriteMatchMvpView>{
        return presenter
    }

    @Provides
    fun provideLinearLayoutManager(@ApplicationContext context: Context): LinearLayoutManager {
        return LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}