package com.example.Doctor

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.doctor.R

class Yoga : Fragment(R.layout.fragment_yoga) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imgsukhasana=view.findViewById<ImageView>(R.id.sukhas)
        val imgkakasana=view.findViewById<ImageView>(R.id.kakas)
        val imgdhanurasana=view.findViewById<ImageView>(R.id.dhanura)
        val imgvakrasana=view.findViewById<ImageView>(R.id.vakras)
        imgsukhasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_sukhas)                                                                                                      
        }
        imgkakasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_kakas)
        }
        imgdhanurasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_dhanura)
        }
        imgvakrasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_vakras)
        }

    }
}