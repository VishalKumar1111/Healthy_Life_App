package com.example.Doctor.Next

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

import com.example.doctor.R

class Meditation:Fragment(R.layout.meditation) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imgmindfull=view.findViewById<ImageView>(R.id.imgmindful)
        val imgkindness=view.findViewById<ImageView>(R.id.img_kindness)
        val imgvipassana=view.findViewById<ImageView>(R.id.img_vipassana)
        val imgawareness=view.findViewById<ImageView>(R.id.img_awareness)

        imgmindfull.setOnClickListener {
            var intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mindfulness"))
            startActivity(intent)
        }
        imgkindness.setOnClickListener{
            var intent2 =Intent(Intent.ACTION_VIEW, Uri.parse("https://positivepsychology.com/loving-kindness-meditation/"))
            startActivity(intent2)
        }
        imgvipassana.setOnClickListener {
            var intent3 =Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dhamma.org/en-US/index"))
            startActivity(intent3)
        }
        imgawareness.setOnClickListener {
            var intent4 =Intent(Intent.ACTION_VIEW, Uri.parse("https://www.headspace.com/meditation/awareness"))
            startActivity(intent4)
        }

    }
}