package com.ahmaddudayef.UASPCS.ui.nextmatch

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class NextMatchModule {

    @Provides
    fun provideNextMatchMvpPresenter(presenter: NextPresenter<NextMvpView>): NextMvpPresenter<NextMvpView>{
        return presenter
    }

    @Provides
    fun provideLinearLayoutManager(@ApplicationContext context: Context): LinearLayoutManager {
        return LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    @Provides
    fun provideNextMatchAdapter(): NextMatchAdapter {
        return NextMatchAdapter(ArrayList())
    }
}