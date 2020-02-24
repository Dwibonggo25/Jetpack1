package com.example.jetpack1.ui.movie

import androidx.test.espresso.Espresso.onView
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
class MoviesFragmentTest {
    @Rule
    @JvmField var activityResult = ActivityTestRule (MainActivity::class.java)

    @Test
    fun loadData () {
        Thread.sleep(300)
        onView(withId(R.id.recyclerViewMovies)).check(matches(isDisplayed()))
    }
}