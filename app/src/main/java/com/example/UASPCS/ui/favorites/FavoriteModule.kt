package com.ahmaddudayef.UASPCS.ui.favorites

import dagger.Module
import dagger.Provides


@Module
class FavoriteModule {
    @Provides
    fun provideFavoriteMvpPresenter(presenter: FavoritePresenter<FavoriteMvpView>): FavoriteMvpPresenter<FavoriteMvpView>{
        return presenter
    }
}