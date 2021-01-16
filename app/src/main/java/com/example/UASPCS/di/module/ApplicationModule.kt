package com.ahmaddudayef.UASPCS.di.module

import android.app.Application
import android.content.Context
import android.support.customtabs.CustomTabsIntent
import android.support.v4.content.ContextCompat
import com.ahmaddudayef.UASPCS.BuildConfig
import com.ahmaddudayef.UASPCS.FootballApplication
import com.ahmaddudayef.UASPCS.R
import com.ahmaddudayef.UASPCS.data.AppDataManager
import com.ahmaddudayef.UASPCS.data.DataManager
import com.ahmaddudayef.UASPCS.data.network.ApiHelper
import com.ahmaddudayef.UASPCS.data.network.AppApiHelper
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import com.ahmaddudayef.UASPCS.di.BaseUrl
import com.ahmaddudayef.UASPCS.utils.rx.AppSchedulerProvider
import com.ahmaddudayef.UASPCS.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Created by Ahmad Dudayef on 9/17/2018.
 */
@Module
class ApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(footballApplication: FootballApplication): Context {
        return footballApplication.applicationContext
    }

    @Provides
    internal fun provideApplication(footballApplication: FootballApplication): Application {
        return footballApplication
    }

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider {
        return AppSchedulerProvider()
    }

    @Provides
    fun provideCustomTabsIntent(@ApplicationContext context: Context): CustomTabsIntent {
        return CustomTabsIntent.Builder()
                .setShowTitle(true)
                .setToolbarColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setSecondaryToolbarColor(ContextCompat.getColor(context, R.color.colorPrimaryDark))
                .addDefaultShareMenuItem()
                .build()
    }

    @Provides
    @BaseUrl
    internal fun provideBaseUrl(): String {
        return BuildConfig.BASE_URL + "api/v1/json/1/"
    }

    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }
}