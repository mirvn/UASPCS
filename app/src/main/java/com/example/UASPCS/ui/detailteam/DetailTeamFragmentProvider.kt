package com.ahmaddudayef.UASPCS.ui.detailteam

import com.ahmaddudayef.UASPCS.ui.infoteam.InfoTeamFragment
import com.ahmaddudayef.UASPCS.ui.infoteam.InfoTeamModule
import com.ahmaddudayef.UASPCS.ui.player.PlayerFragment
import com.ahmaddudayef.UASPCS.ui.player.PlayerModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class DetailTeamFragmentProvider {
    @ContributesAndroidInjector(modules = [(InfoTeamModule::class)])
    internal abstract fun provideInfoTeamFragmentFactory(): InfoTeamFragment

    @ContributesAndroidInjector(modules = [(PlayerModule::class)])
    internal abstract fun providePlayerFragmentFactory(): PlayerFragment
}