package com.example.runwaygame.ui.runway

import androidx.lifecycle.ViewModel
import com.example.runwaygame.R

class RunwayViewModel: ViewModel() {

    fun getDistance(distance: Int, groundType: Int): ArrayList<Int> {
        val runway = ArrayList<Int>()
        val resId: Int = groundType
        (0..distance).forEach {
            runway.add(resId)
        }
        return runway
    }
}