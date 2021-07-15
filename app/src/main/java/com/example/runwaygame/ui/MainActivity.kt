package com.example.runwaygame.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.runwaygame.App
import com.example.runwaygame.R
import com.example.runwaygame.common.Screens
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainActivity : AppCompatActivity() {

    private val navigator = AppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).router.newRootScreen(Screens.main())
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        (application as App).navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        (application as App).navigatorHolder.removeNavigator()
    }
}