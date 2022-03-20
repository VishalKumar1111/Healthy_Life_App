package com.example.doctor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Analysis : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_analysis, container, false)
        view.findViewById<Button>(R.id.btn_analysis).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_analysis_to_meditation) }
        return view
    }

}