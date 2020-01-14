package com.example.jetpack1.ui.movie

import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule

class MoviesFragmentTest {

    @Rule
    var activityRule: ActivityTestRule<SingleFragmentActivity> =
        ActivityTestRule(SingleFragmentActivity::class.java)
    private val academyFragment = AcademyFragment()

}