package com.ahmaddudayef.UASPCS.ui.searchMatch

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.ahmaddudayef.UASPCS.di.ApplicationContext
import com.ahmaddudayef.UASPCS.ui.prevmatch.PrevMatchAdapter
import dagger.Module
import dagger.Provides


@Module
class SearchMatchModule {

    @Provides
    fun provideSearchMatchMvpPresenter(presenter: SearchMatchPresenter<SearchMatchMvpView>): SearchMatchMvpPresenter<SearchMatchMvpView>{
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