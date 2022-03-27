package com.example.doctor.Yoga_Types

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.doctor.R

class Dhanurasana:Fragment(R.layout.dhanurasana) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val txt_dhanurasana=view.findViewById<TextView>(R.id.detail_dhanurasana)


        txt_dhanurasana.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wgH2PdPnZGM"))
            startActivity(intent)

        }
    }
}