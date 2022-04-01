package com.example.doctor.Starting

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.doctor.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.sign_up.*

class Login:Fragment(R.layout.login){
    private lateinit var auth: FirebaseAuth

    private val  ref=FirebaseAuth.getInstance()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()

        val login=view.findViewById<EditText>(R.id.login_email)
        val password=view.findViewById<EditText>(R.id.login_password)
        val register=view.findViewById<Button>(R.id.register_button)

        register.setOnClickListener {

            if(android.util.Patterns.EMAIL_ADDRESS.matcher(login.text.toString()).matches() && password.text.toString().isNotBlank()) {
                ref.createUserWithEmailAndPassword(login.text.toString().trim(),
                    password.text.toString().trim())
                Navigation.findNavController(view).navigate(R.id.action_Login_to_analysis)
                Toast.makeText(requireContext(),"Logged In Succesfully",Toast.LENGTH_SHORT).show()
            }else
                Toast.makeText(requireContext(),"Enter a Valid Email ",Toast.LENGTH_SHORT).show()
            if ( password.text.toString().isBlank())
                Toast.makeText(requireContext(), "All field are requied",Toast.LENGTH_SHORT).show()
        }
    }
}