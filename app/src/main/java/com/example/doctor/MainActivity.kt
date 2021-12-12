package com.example.doctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var toogle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toogle= ActionBarDrawerToggle(this,findViewById(R.id.drawerLayout),R.string.open,R.string.close )
        findViewById<DrawerLayout>(R.id.drawerLayout).addDrawerListener(toogle)
        toogle.syncState()
        findViewById<NavigationView>(R.id.navigation_view).setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item_analysis ->Toast.makeText(applicationContext,"clicked analysis",Toast.LENGTH_SHORT).show()
                R.id.item_meditation ->Toast.makeText(applicationContext,"clicked Meditation",Toast.LENGTH_SHORT).show()
                R.id.item_quiz ->Toast.makeText(applicationContext,"clicked Quiz",Toast.LENGTH_SHORT).show()
                R.id.item_quiz ->Toast.makeText(applicationContext,"clicked Quiz",Toast.LENGTH_SHORT).show()

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