package com.example.doctor.Next.QuestionActivity

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.doctor.Next.Quizes
import com.example.doctor.R
import kotlinx.android.synthetic.main.fragement_quiz_main.*
import kotlinx.android.synthetic.main.model.*

var name = ""
class QuestionMainactivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_quiz_main)

        btnStartQuiz.setOnClickListener {
            if (tvName.text.toString().isEmpty()) {
                tvNameParent.error = "Please provide a name"
            } else {
                name = tvName.text.toString()
                startActivity(
                    Intent(
                        this,
                        Question::class.java,
                    )
                )
            }
        }
    }
}