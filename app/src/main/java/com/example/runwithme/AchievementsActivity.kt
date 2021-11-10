package com.example.runwithme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.runwithme.adapter.AchievementAdapter
import com.example.runwithme.data.AchievementsDataSource
import javax.sql.DataSource

class AchievementsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        // Initialize the data
        val myDataset = AchievementsDataSource().loadAchievements()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = AchievementAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}