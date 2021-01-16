package com.ahmaddudayef.UASPCS.di.module

import com.ahmaddudayef.UASPCS.ui.detail.DetailMatchActivity
import com.ahmaddudayef.UASPCS.ui.detail.DetailMatchModule
import com.ahmaddudayef.UASPCS.ui.detailplayer.DetailPlayerActivity
import com.ahmaddudayef.UASPCS.ui.detailplayer.DetailPlayerModule
import com.ahmaddudayef.UASPCS.ui.detailteam.DetailTeamActivity
import com.ahmaddudayef.UASPCS.ui.detailteam.DetailTeamFragmentProvider
import com.ahmaddudayef.UASPCS.ui.detailteam.DetailTeamModule
import com.ahmaddudayef.UASPCS.ui.home.FragmentProvider
import com.ahmaddudayef.UASPCS.ui.home.HomeActivity
import com.ahmaddudayef.UASPCS.ui.home.HomeActivityModule
import com.ahmaddudayef.UASPCS.ui.searchMatch.SearchMatchActivity
import com.ahmaddudayef.UASPCS.ui.searchMatch.SearchMatchModule
import com.ahmaddudayef.UASPCS.ui.searchTeam.SearchTeamActivity
import com.ahmaddudayef.UASPCS.ui.searchTeam.SearchTeamModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Ahmad Dudayef on 9/17/2018.
 */
@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [(HomeActivityModule::class), (FragmentProvider::class)])
    abstract fun bindHomeActivity(): HomeActivity

    @ContributesAndroidInjector(modules = [(DetailMatchModule::class)])
    abstract fun bindDetailMatchActivity(): DetailMatchActivity

    @ContributesAndroidInjector(modules = [(DetailTeamModule::class), (DetailTeamFragmentProvider::class)])
    abstract fun bindDetailTeamActivity(): DetailTeamActivity

    @ContributesAndroidInjector(modules = [(SearchMatchModule::class)])
    abstract fun bindSearchMatchActivity(): SearchMatchActivity

    @ContributesAndroidInjector(modules = [(SearchTeamModule::class)])
    abstract fun bindSearchTeamActivity(): SearchTeamActivity

    @ContributesAndroidInjector(modules = [(DetailPlayerModule::class)])
    abstract fun bindDetailPlayerActivity(): DetailPlayerActivity
}