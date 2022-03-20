package com.example.doctor.Next

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.doctor.Next.QuestionActivity.Questionactivity
import com.example.doctor.R
import kotlinx.android.synthetic.main.model.*
import kotlinx.android.synthetic.main.quiz.*

class Quizes: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

       window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener{
            val intent=Intent(this,Questionactivity::class.java)
            startActivity(intent)
            finish()

        }
            }
}