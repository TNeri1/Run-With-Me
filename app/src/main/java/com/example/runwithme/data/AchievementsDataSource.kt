package com.example.runwithme.data

import com.example.runwithme.R
import com.example.runwithme.model.Achievement

class AchievementsDataSource {

    fun loadAchievements() : List<Achievement> {
        return listOf<Achievement>(
            Achievement(R.drawable.a1),
            Achievement(R.drawable.a2),
            Achievement(R.drawable.a3)
        )
    }
}