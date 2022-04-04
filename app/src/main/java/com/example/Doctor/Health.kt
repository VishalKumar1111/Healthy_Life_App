package com.example.Doctor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import com.example.doctor.R


class Health : Fragment(R.layout.fragment_health) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val heal=view.findViewById<Button>(R.id.btn_health)
        heal.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_health_to_cardView)
        }



    }

        }