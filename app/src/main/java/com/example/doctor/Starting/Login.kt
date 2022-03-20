package com.example.doctor.Starting

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.doctor.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class Login:Fragment(R.layout.login) {
    val ref=FirebaseAuth.getInstance()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val login=view.findViewById<EditText>(R.id.login_email)
        val password=view.findViewById<EditText>(R.id.login_password)
        val register=view.findViewById<Button>(R.id.register_button)

        register.setOnClickListener {
            ref.createUserWithEmailAndPassword(login.text.toString().trim(),
                password.text.toString().trim())
            Navigation.findNavController(view).navigate(R.id.action_Login_to_analysis)
        }


    }
}