package com.example.Doctor.Next

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.example.Doctor.R
import kotlinx.android.synthetic.main.analysis.*

class Analysis: Fragment(R.layout.analysis){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        img_cancer.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_cancer)
        }
        img_covid.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_covid)
        }
        img_dengue.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_dengue)
        }
        img_maleria.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_maleria)
        }
        img_pneumonia.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_pneumonia)
        }
        img_flu.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_flu)
        }
        img_tb.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_tuberclosis)
        }
        img_typhoid.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_analys_to_typhoid_fever)
        }

    }

}