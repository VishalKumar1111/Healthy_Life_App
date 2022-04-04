package com.example.Doctor.Next.QuestionActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Doctor.R
import kotlinx.android.synthetic.main.fragement_quiz_main.*
var name = ""
class MainQuestionActivity: AppCompatActivity() {



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


