package com.example.runwithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal)

        val feedButton = findViewById<ImageButton>(R.id.feed)

        feedButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Your Pet is already full!", Toast.LENGTH_LONG).show()
            })



    }
}