package com.example.runwaygame.common

import com.example.runwaygame.ui.menu.MenuFragment
import com.example.runwaygame.ui.runway.RunwayFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {

    fun main() = FragmentScreen {
        MenuFragment()
    }

    fun runwayFragment() = FragmentScreen {
        RunwayFragment()
    }

}