package com.example.doctor.Yoga_Types

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.doctor.R

class Vakrasana:Fragment(R.layout.vakrasana) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt_vakrasana=view.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mindfulness"))
            startActivity(intent)
        }
    }
}