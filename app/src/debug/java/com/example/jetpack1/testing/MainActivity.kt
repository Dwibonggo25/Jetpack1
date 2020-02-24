package com.example.jetpack1.testing

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.jetpack1.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val content = FrameLayout(this)
        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT,
            Gravity.CENTER
        )
        content.layoutParams = params
        content.id = R.id.container

        setContentView(content)
    }

    fun setFragment (fragment: Fragment) {
        val host = NavHostFragment.create(com.example.jetpack1.R.navigation.navigation)
        supportFragmentManager.beginTransaction().replace(com.example.jetpack1.R.id.main_nav_fragment, host).setPrimaryNavigationFragment(host).commit()
    }

}