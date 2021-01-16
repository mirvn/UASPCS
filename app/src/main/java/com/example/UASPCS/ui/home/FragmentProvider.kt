package com.ahmaddudayef.UASPCS.ui.home

import com.ahmaddudayef.UASPCS.ui.favoritematch.FavoriteMatchFragment
import com.ahmaddudayef.UASPCS.ui.favoritematch.FavoriteMatchModule
import com.ahmaddudayef.UASPCS.ui.favoriteplayer.FavoritePlayerFragment
import com.ahmaddudayef.UASPCS.ui.favoriteplayer.FavoritePlayerModule
import com.ahmaddudayef.UASPCS.ui.favorites.FavoriteFragment
import com.ahmaddudayef.UASPCS.ui.favorites.FavoriteModule
import com.ahmaddudayef.UASPCS.ui.favoriteteam.FavoriteTeamFragment
import com.ahmaddudayef.UASPCS.ui.favoriteteam.FavoriteTeamModule
import com.ahmaddudayef.UASPCS.ui.matches.MatchFragment
import com.ahmaddudayef.UASPCS.ui.matches.MatchModule
import com.ahmaddudayef.UASPCS.ui.nextmatch.NextMatchFragment
import com.ahmaddudayef.UASPCS.ui.nextmatch.NextMatchModule
import com.ahmaddudayef.UASPCS.ui.prevmatch.PrevMatchFragment
import com.ahmaddudayef.UASPCS.ui.prevmatch.PrevMatchModule
import com.ahmaddudayef.UASPCS.ui.teams.TeamFragment
import com.ahmaddudayef.UASPCS.ui.teams.TeamModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentProvider {

    @ContributesAndroidInjector(modules = [(NextMatchModule::class)])
    internal abstract fun provideNextMatchFragmentFactory(): NextMatchFragment

    @ContributesAndroidInjector(modules = [(PrevMatchModule::class)])
    internal abstract fun providePrevMatchFragmentFactory(): PrevMatchFragment

    @ContributesAndroidInjector(modules = [(FavoriteMatchModule::class)])
    internal abstract fun provideFavoritMatchFragmentFactory(): FavoriteMatchFragment

    @ContributesAndroidInjector(modules = [(FavoriteTeamModule::class)])
    internal abstract fun provideFavoriteTeamFragmentFactory(): FavoriteTeamFragment

    @ContributesAndroidInjector(modules = [(MatchModule::class)])
    internal abstract fun provideMatchesFragmentFactory(): MatchFragment

    @ContributesAndroidInjector(modules = [(TeamModule::class)])
    internal abstract fun provideTeamFragmentFactory(): TeamFragment

    @ContributesAndroidInjector(modules = [(FavoriteModule::class)])
    internal abstract fun provideFavoriteFragmentFactory(): FavoriteFragment

    @ContributesAndroidInjector(modules = [(FavoritePlayerModule::class)])
    internal abstract fun provideFavoritePlayerFragmentFactory(): FavoritePlayerFragment
}