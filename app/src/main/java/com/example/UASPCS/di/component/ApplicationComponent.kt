package com.ahmaddudayef.UASPCS.di.component

import com.ahmaddudayef.UASPCS.FootballApplication
import com.ahmaddudayef.UASPCS.di.module.ActivityBindingModule
import com.ahmaddudayef.UASPCS.di.module.ApplicationModule
import com.ahmaddudayef.UASPCS.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules =
        [
            AndroidSupportInjectionModule::class,
            NetworkModule::class,
            ApplicationModule::class,
            ActivityBindingModule::class
        ]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(footballApplication: FootballApplication): Builder

        fun build(): ApplicationComponent
    }

    fun inject(footballApplication: FootballApplication)
}