package com.example.jetpack1.testing

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val host = NavHostFragment.create(com.example.jetpack1.R.navigation.navigation)
        supportFragmentManager.beginTransaction().replace(com.example.jetpack1.R.id.main_nav_fragment, host).setPrimaryNavigationFragment(host).commit()
    }

}