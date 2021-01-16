package com.ahmaddudayef.UASPCS.ui.home

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.ahmaddudayef.UASPCS.ui.favorites.FavoriteFragment
import com.ahmaddudayef.UASPCS.ui.matches.MatchFragment
import com.ahmaddudayef.UASPCS.ui.teams.TeamFragment


class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment? {
        return when (position){
            0 -> MatchFragment.newInstance()
            1 -> TeamFragment.newInstance()
            2 -> FavoriteFragment.newInstance()
            else -> null
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return null
    }

    override fun getCount(): Int {
        return 3
    }

}