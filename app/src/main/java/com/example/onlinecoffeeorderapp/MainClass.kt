package com.example.onlinecoffeeorderapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        var startbtn = findViewById<View>(R.id.btnStart) as Button

        startbtn.setOnClickListener {

            //creating intent to set the string values of all editTextView
            val i = Intent(this, HomePageClass::class.java)

            startActivity(i)
        }
    }
}
