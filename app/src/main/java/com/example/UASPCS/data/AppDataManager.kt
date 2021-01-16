package com.ahmaddudayef.UASPCS.data

import com.ahmaddudayef.UASPCS.data.network.AppApiHelper
import com.ahmaddudayef.UASPCS.data.network.model.league.Leagues
import com.ahmaddudayef.UASPCS.data.network.model.player.FavoritePlayers
import com.ahmaddudayef.UASPCS.data.network.model.player.Players
import com.ahmaddudayef.UASPCS.data.network.model.schedule.Events
import com.ahmaddudayef.UASPCS.data.network.model.searchmatch.SearchedMatches
import com.ahmaddudayef.UASPCS.data.network.model.team.TeamResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


class AppDataManager @Inject constructor(
        private val appApiHelper: AppApiHelper
): DataManager {

    override fun getTeams(league: String): Observable<TeamResponse> {
        return appApiHelper.getTeams(league)
    }

    override fun getNextSchedule(league: String): Observable<Events> {
        return appApiHelper.getNextSchedule(league)
    }

    override fun getLastSchedule(league: String): Observable<Events> {
        return appApiHelper.getLastSchedule(league)
    }

    override fun getDetailTeam(idTeam: String): Single<TeamResponse> {
        return appApiHelper.getDetailTeam(idTeam)
    }

    override fun getAllLeagues(): Single<Leagues> {
        return appApiHelper.getAllLeagues()
    }

    override fun getMatchById(id: String): Flowable<Events> {
        return appApiHelper.getMatchById(id)
    }

    override fun getAllTeams(id: String): Flowable<TeamResponse> {
        return appApiHelper.getAllTeams(id)
    }

    override fun getAllPlayers(id: String): Flowable<Players> {
        return appApiHelper.getAllPlayers(id)
    }

    override fun searchMatches(e: String?): Flowable<SearchedMatches> {
        return appApiHelper.searchMatches(e)
    }

    override fun searchCLub(t: String?): Flowable<TeamResponse> {
        return appApiHelper.searchCLub(t)
    }

    override fun getTeamById(id: String): Flowable<TeamResponse> {
        return appApiHelper.getTeamById(id)
    }

    override fun getPlayerById(id: String): Flowable<FavoritePlayers> {
        return appApiHelper.getPlayerById(id)
    }

}