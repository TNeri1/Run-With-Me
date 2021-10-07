package com.example.runwithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popupMenu()
    }

    private fun popupMenu() {
        val popupMenu = PopupMenu(applicationContext, menu_options)
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.setting -> {
                    Toast.makeText(applicationContext, "Open Settings", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.profile -> {
                    Toast.makeText(applicationContext, "Open User Profile", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.achievements -> {
                    Toast.makeText(applicationContext, "Open User Achievements", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.pets -> {
                    Toast.makeText(applicationContext, "Open User Pets", Toast.LENGTH_SHORT).show()
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