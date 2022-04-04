package com.example.Doctor.Yoga_Types

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.content.Intent
import android.net.Uri
import com.example.doctor.R


class kakasana:Fragment(R.layout.kakasana) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       val txt_kakasana=view.findViewById<TextView>(R.id.detail_kakasana)

        txt_kakasana.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ib2Oc2ya0zg"))
            startActivity(intent)
        }
    }
}