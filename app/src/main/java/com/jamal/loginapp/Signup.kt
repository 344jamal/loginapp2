package com.jamal.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val buttonsignup = findViewById<Button>(R.id.signupbtn)
        val logintext = findViewById<TextView>(R.id.logintxt)
        buttonsignup.setOnClickListener {
            val i = Intent(this, Home::class.java)
            startActivity(i)
        }
        logintext.setOnClickListener {
            val x = Intent(this, MainActivity::class.java)
            startActivity(x)
        }
    }
}