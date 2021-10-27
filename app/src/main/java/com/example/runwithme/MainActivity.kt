package com.example.runwithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popupMenu()

        val exerciseButton = findViewById<ImageButton>(R.id.exercise)

        exerciseButton.setOnClickListener(View.OnClickListener {
            var intent = Intent(this@MainActivity,ExerciseActivity::class.java)
            startActivity(intent)
        })

        val mealButton = findViewById<ImageButton>(R.id.mealButton)

        mealButton.setOnClickListener(View.OnClickListener {
            var intent = Intent(this@MainActivity,MealActivity::class.java)
            startActivity(intent)
        })
    }

    private fun popupMenu() {
        val popupMenu = PopupMenu(applicationContext, menu_options)
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.setting -> {
                    var intent = Intent(this@MainActivity,SettingsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    var intent = Intent(this@MainActivity,ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.achievements -> {
                    var intent = Intent(this@MainActivity,AchievementsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.pets -> {
                    var intent = Intent(this@MainActivity,PetsActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> true
            }
        }

        menu_options.setOnClickListener {
            try {
                val popup = PopupMenu::class.java.getDeclaredField("mPopup")
                popup.isAccessible = true
                val menu = popup.get(popupMenu)
                menu.javaClass
                    .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                    .invoke(menu, true)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                popupMenu.show()
            }
            true


        }

    }
}