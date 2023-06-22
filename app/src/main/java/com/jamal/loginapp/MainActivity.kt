package com.jamal.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginbutton = findViewById<Button>(R.id.loginbtn)
        val textView = findViewById<TextView>(R.id.signuptxt)
        loginbutton.setOnClickListener {
            val i = Intent(this, Home::class.java)
            startActivity(i)
        }
        textView.setOnClickListener {
            val x = Intent(this, Signup::class.java)
            startActivity(x)
        }
    }
}