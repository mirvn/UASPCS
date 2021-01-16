package com.ahmaddudayef.UASPCS.ui.prevmatch

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class PrevMatchModule {

    @Provides
    fun providePrevMatchMvpPresenter(presenter: PrevPresenter<PrevMvpView>): PrevMvpPresenter<PrevMvpView>{
        return presenter
    }

    @Provides
    fun provideLinearLayourManager(@ApplicationContext context: Context): LinearLayoutManager {
        return LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    @Provides
    fun provideLastMatchAdapter(): PrevMatchAdapter {
        return PrevMatchAdapter(ArrayList())
    }
}