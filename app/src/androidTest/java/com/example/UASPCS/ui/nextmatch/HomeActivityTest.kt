package com.ahmaddudayef.UASPCS.ui.nextmatch

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.pressBack
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.ahmaddudayef.UASPCS.R.id.*
import com.ahmaddudayef.UASPCS.ui.home.HomeActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class HomeActivityTest {
    @Rule
    @JvmField var activityRule = ActivityTestRule(HomeActivity::class.java)

    @Test
    fun testRecyclerViewBehaviour() {
        delay()
        onView(withId(spinnerNextMatch))
                .check(matches(isDisplayed()))
        delay()
        onView(withId(spinnerNextMatch)).perform(click())
        delay()
        onView(withText("Italian Serie A")).perform(click())
        delay()
        onView(withText("Juventus"))
                .check(matches(isDisplayed()))
        delay()
        onView(withText("Juventus")).perform(click())
        delay()
        onView(withId(favorite))
                .check(matches(isDisplayed()))
        delay()
        onView(withId(favorite)).perform(click())
        delay()
        pressBack()
    }

    private fun delay(){
        try {
            Thread.sleep(3000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

}