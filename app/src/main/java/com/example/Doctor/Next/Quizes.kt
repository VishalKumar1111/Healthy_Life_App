package com.example.Doctor.Next

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.Doctor.Next.QuestionActivity.QuestionMainactivity
import kotlinx.android.synthetic.main.quiz.*

class Quizes: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

       window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener{
            val intent=Intent(this,QuestionMainactivity::class.java)
            startActivity(intent)
            finish()

        }
            }
}