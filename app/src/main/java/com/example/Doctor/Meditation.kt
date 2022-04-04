package com.example.Doctor

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.Doctor.R
import kotlinx.android.synthetic.main.fragment_meditation.*


class  Meditation : Fragment(R.layout.fragment_meditation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btn_meditation.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_meditation_to_quiz)
        }
    }
}