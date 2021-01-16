package com.ahmaddudayef.UASPCS.ui.favoritematch

import android.content.Context
import com.ahmaddudayef.UASPCS.data.db.entities.MatchEntity
import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter
import io.reactivex.Single

interface FavoriteMatchMvpPresenter<V: FavoriteMatchMvpView>: MvpPresenter<V>{
    fun getMatchFavorite(context: Context?): Single<List<MatchEntity>>
    fun getNextMatch(context: Context?)
}