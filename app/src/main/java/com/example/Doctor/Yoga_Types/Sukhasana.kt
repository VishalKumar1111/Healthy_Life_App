package com.example.Doctor.Yoga_Types

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.doctor.R

class Sukhasana:Fragment(R.layout.sukhasana) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val txt_sukhsana=view.findViewById<TextView>(R.id.detail_sukhasana)
        val mediaController=MediaController(requireContext())
        mediaController.setAnchorView(view)



        txt_sukhsana.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=sukhasana"))
            startActivity(intent)
        }
    }
}