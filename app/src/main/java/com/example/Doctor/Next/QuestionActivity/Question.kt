package com.example.Doctor.Next.QuestionActivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.Doctor.R


class Question : Fragment(R.layout.fragment_question2) {

    private var count=0
    var score=0
    private var next=0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text=view.findViewById<TextView>(R.id.textView)
        val button=view.findViewById<Button>(R.id.button2)
        val button2=view.findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            count++
            var score=0
            if(count==1)
            {
                text.text="Is you ARe Felling Depressed"
                score+=1
            }
            if(count==2)
            {
                text.text="Are you Felling cold"
                score+=1
            }
            if(count==3)
            {
                text.text="Disappointment at home, work, or school (in teens, this may be breaking up with a boyfriend or girlfriend, failing a class or parents divorcing)"
                score+=1

            }
            if (count==4)
            {
                text.text="Do you often oversleep? Do you think you get too little sleep (and may have insomnia)?"
                score+=1
            }
            if (count==5){
                text.text="Do you have aches and pains?"
                score+=1
            }
            /*    if (count>3)
               {
                    findNavController().navigate(R.id.action_fourth_to_yes)
                }
        */
        }
        button2.setOnClickListener {
            next++
            if (next==1){
                text.text="Have parents, other relatives, or maybe even friends accused you of being “irritated,” “nasty,” or “always in a bad mood?"
                score-+1
            }
            if (next==2){
                text.text="Does life seem pointless?"
                score-=1
            }
            if(next==3){
                text.text="Does it seem like it’s impossible to concentrate?"
                score-=1
            }
            if (next==4){
                text.text="Have you withdrawn from your friends and family?"
                score-=1
            }
            if (next==5){
                text.text="Have you noticed a sudden change in your weight?"
                score-=1
            }
        }

        /*     if (score>3){
             findNavController().navigate(R.id.action_fourth_to_yes)
             }
         */
    }
}