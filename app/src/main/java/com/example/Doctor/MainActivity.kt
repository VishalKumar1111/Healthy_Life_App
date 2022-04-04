package com.example.Doctor

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.Doctor.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var toogle: ActionBarDrawerToggle

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toogle= ActionBarDrawerToggle(this,findViewById(R.id.drawerLayout), R.string.open,R.string.close )
        findViewById<DrawerLayout>(R.id.drawerLayout).addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
        findViewById<NavigationView>(R.id.navigation_view).setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item_analysis -> {
                    Toast.makeText(applicationContext, "clicked analysis", Toast.LENGTH_SHORT).show()
                }
                R.id.item_meditation ->{
                    Toast.makeText(applicationContext,"clicked Meditation",Toast.LENGTH_SHORT).show()
                }
                R.id.item_quiz ->Toast.makeText(applicationContext,"clicked Quiz",Toast.LENGTH_SHORT).show()
                R.id.item_health ->Toast.makeText(applicationContext,"clicked Quiz",Toast.LENGTH_SHORT).show()

            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toogle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}