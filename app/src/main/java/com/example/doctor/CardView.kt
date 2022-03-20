package com.example.doctor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_card_view.*


class CardView : Fragment(R.layout.fragment_card_view) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imganalysis=view.findViewById<ImageView>(R.id.img_analysis)
        val imgquiz=view.findViewById<ImageView>(R.id.img_quiz)
        val imgmeditation=view.findViewById<ImageView>(R.id.img_meditation)
        imganalysis.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_cardView_to_analys)
        }
        imgquiz.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_cardView_to_quizes2)
        }
        imgmeditation.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_cardView_to_medico)
          }
        img_yoga.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_cardView_to_yoga)
        }
         }
    }