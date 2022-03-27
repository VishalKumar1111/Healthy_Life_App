package com.example.doctor

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class Yoga : Fragment(R.layout.fragment_yoga) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imgsukhasana=view.findViewById<ImageView>(R.id.sukhas)
        val imgkakasana=view.findViewById<ImageView>(R.id.kakas)
        val imgdhanurasana=view.findViewById<ImageView>(R.id.dhanura)
        val imgvakrasana=view.findViewById<ImageView>(R.id.vakras)
        imgsukhasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_sukhasana)
        }
        imgkakasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_kakasana)
        }
        imgdhanurasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_dhanurasana)
        }
        imgvakrasana.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_yoga_to_vakrasana)
        }

    }
}