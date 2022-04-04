package com.example.Doctor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import com.example.Doctor.R

class Quiz : Fragment(R.layout.fragment_quiz) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val health=view.findViewById<Button>(
            R.id.btn_quiz)

        health.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_quiz_to_health)
        }
    }
}