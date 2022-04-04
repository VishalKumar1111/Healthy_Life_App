package com.example.Doctor.Next.QuestionActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.Doctor.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_result)

        // Set name on result page
        tvNameResult.text = "Congratulations $name"
        tvScore.text = "Your score is $score/${getQuestions().size}"

        btnFinish.setOnClickListener {
            // Reset the score when the game finishes
            score = 0

            // Go to homepage
            startActivity(
                Intent(
                    this,
                    MainQuestionActivity::class.java,
                )
            )

        }

    }
}

