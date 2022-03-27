package com.example.doctor.Next.QuestionActivity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.doctor.Next.Quizes
import com.example.doctor.R
import kotlinx.android.synthetic.main.model.*

class Questionactivity : Fragment(R.layout.model),View.OnClickListener{

    private var mcurrentposition: Int=1
    private var mQuestionlist: ArrayList<Question>?=null
    private var mSelectedoptionposition:Int=0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mQuestionlist=Constents.getQuestions()
        setQuestion()

        tv_option1.setOnClickListener(this)
        tv_option2.setOnClickListener(this)
        tv_option3.setOnClickListener(this)
        tv_option4.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }

    private fun setQuestion() {
        val question=mQuestionlist!!.get(mcurrentposition - 1)
        defaultoptionView()
        if (mQuestionlist!!.size==mcurrentposition){
            btn_submit.text="Finished"
        }else{
            btn_submit.text="Submit"
        }

        progressBar.progress=mcurrentposition
        tv_progress.text="$mcurrentposition" + "/" + progressBar.max

        tv_question.text=question.question
        tv_option1.text=question.option1
        tv_option2.text=question.option2
        tv_option3.text=question.option3
        tv_option4.text=question.option4
    }

    private fun defaultoptionView() {
        val options=ArrayList<TextView>()
        options.add(0,tv_option1)
        options.add(1,tv_option2)
        options.add(2,tv_option3)
        options.add(3,tv_option4)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }

    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option1 ->{
                selectedOptionView(tv_option1,0)
            }
             R.id.tv_option2 ->{
                        selectedOptionView(tv_option2,1)
                    }
             R.id.tv_option3 ->{
                        selectedOptionView(tv_option3,2)
                    }
             R.id.tv_option4 ->{
                        selectedOptionView(tv_option4,3)
                    }
             R.id.btn_submit ->{
                 if (mSelectedoptionposition==0){
                     mcurrentposition++
                    when{
                        mcurrentposition<=mQuestionlist!!.size->{
                            setQuestion()
                        }else->{
                            Toast.makeText(this,"You Have Completed the Quiz",Toast.LENGTH_SHORT).show()
                            val intent=Intent(this,Quizes::class.java)
                            startActivity(intent)
                        }
                    }
                 }
              else{
                  val question=mQuestionlist?.get(mcurrentposition - 1)
                  if (question!!.correctoption!=mSelectedoptionposition){
                    answerView(mSelectedoptionposition,R.drawable.wrong_option_border_bg)
                  }
                     answerView(question.correctoption,R.drawable.correct_option_border_bg)
                     if (mcurrentposition==mQuestionlist!!.size){
                         btn_submit.text="Finshed"
                     }else{
                         btn_submit.text="Go to Next Question"
                     }
                     mSelectedoptionposition=0
              }
             }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when(answer){
            1 ->{
                tv_option1.background=ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                tv_option2.background=ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                tv_option3.background=ContextCompat.getDrawable(this,drawableView)
            }
            4->{
                tv_option4.background=ContextCompat.getDrawable(this,drawableView)
            }
        }

    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultoptionView()
        mSelectedoptionposition=selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(context,R.drawable.selected_option_border_bg)
    }


}