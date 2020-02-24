package com.example.jetpack1.ui.tvshow

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.example.jetpack1.MainActivity
import com.example.jetpack1.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class TvShowsFragmentTest {

    @Rule
    @JvmField
    var activityResult = ActivityTestRule (MainActivity::class.java)

    @Test
    fun loadTvShows () {

        Thread.sleep(300)
        onView(withId(R.id.viewPager)).perform(swipeLeft())

        Thread.sleep(300)
        onView(withId(R.id.recyclerViewTvShows)).check(matches(isDisplayed()))
    }
}