package com.lemien.secondapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    var name: EditText? = null
    var city: EditText? = null
    var college: EditText? = null
    var check: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_new)
        name = findViewById(R.id.enterYourName)
        city = findViewById(R.id.enterYourCity)
        college = findViewById(R.id.enterYourCollegeName)
        check = findViewById(R.id.check)
        check?.setOnClickListener {
            if (name?.text?.trim().isNullOrEmpty()) {
                name?.error = "enter your name"
            } else if (college?.text?.trim().isNullOrEmpty()) {
                college?.error = "enter college name"
            } else {
                Toast.makeText(
                    this,
                    "Button is pressed $ {name?.text}",
                    Toast.LENGTH_SHORT
                ).show()
                var intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)

                /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        */
            }
        }
    }
}