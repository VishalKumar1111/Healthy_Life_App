package com.example.doctor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.Navigation

class Quiz : Fragment(R.layout.fragment_health) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val health=view.findViewById<Button>(R.id.btn_health)

        health.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_quiz_to_health)
        }
    }
}