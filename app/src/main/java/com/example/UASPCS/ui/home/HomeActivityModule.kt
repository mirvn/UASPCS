package com.ahmaddudayef.UASPCS.ui.home

import dagger.Module
import dagger.Provides


@Module
class HomeActivityModule {

    @Provides
    fun provideHomeMvpPresenter(presenter: HomePresenter<HomeMvpView>): HomeMvpPresenter<HomeMvpView>{
        return presenter
    }

    @Provides
    fun provideViewPagerAdapter(homeActivity: HomeActivity): ViewPagerAdapter {
        return ViewPagerAdapter(homeActivity.supportFragmentManager)
    }
}