package com.ahmaddudayef.UASPCS.ui.favoriteteam

import android.content.Context
import com.ahmaddudayef.UASPCS.data.db.entities.TeamEntity
import com.ahmaddudayef.UASPCS.ui.base.MvpPresenter
import io.reactivex.Single


interface FavoriteTeamMvpPresenter<V: FavoriteTeamMvpView>: MvpPresenter<V> {
    fun getTeamFavorite(context: Context?): Single<List<TeamEntity>>
    fun getTeam(context: Context?)
}