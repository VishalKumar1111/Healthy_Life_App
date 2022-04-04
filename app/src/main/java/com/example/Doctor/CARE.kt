package com.example.Doctor

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.Doctor.R
import kotlinx.android.synthetic.main.medicine.*

class CARE : Fragment(R.layout.medicine) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        img_amoxicillin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_medicine_to_amoxicillin)
        }
        img_evion.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_medicine_to_evion)
        }
        img_paracetamol.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_medicine_to_paracetamol)
        }
        img_pudin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_medicine_to_hrapudina)
        }
        img_crocin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_medicine_to_crocin)
        }
        img_Vitamin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_medicine_to_vitamin_d)
        }

    }

}