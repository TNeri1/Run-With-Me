package com.example.runwithme.data

import com.example.runwithme.R
import com.example.runwithme.model.Achievement

class AchievementsDataSource {

    fun loadAchievements() : List<Achievement> {
        return listOf<Achievement>(
            Achievement(R.drawable.a1_text__1_),
            Achievement(R.drawable.a2_text__1_),
            Achievement(R.drawable.a3_text__1_)
        )
    }
}