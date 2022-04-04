package com.example.Doctor.Next.QuestionActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.Doctor.R
import kotlinx.android.synthetic.main.fragement_quiz_main.*
var name = ""
class MainQuestionActivity: Fragment(R.layout.fragement_quiz_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



            btnStartQuiz.setOnClickListener {
     /*           if (tvName.text.toString().isEmpty()) {
                    tvNameParent.error = "Please provide a name"
                } else { name = tvName.text.toString()
                   startActivity(
                        Intent( requireContext(),QuestionActivity::class.java,)
                    )*/
                    Navigation.findNavController(view).navigate(R.id.action_mian_quiz_to_question)

            }
        }
}


