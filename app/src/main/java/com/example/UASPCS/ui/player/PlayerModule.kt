package com.ahmaddudayef.UASPCS.ui.player

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class PlayerModule {

    @Provides
    fun providePlayerMvpPresenter(presenter: PlayerPresenter<PlayerMvpView>): PlayerMvpPresenter<PlayerMvpView> {
        return presenter
    }

    @Provides
    fun provideGridLayoutManager(@ApplicationContext context: Context): GridLayoutManager {
        return GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
    }

    @Provides
    fun providePlayerAdapter(): PlayerAdapter {
        return PlayerAdapter(ArrayList())
    }

}