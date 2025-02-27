package com.seneca.firstdemoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thankyou)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val thirdButton : Button = findViewById(R.id.thirdButton)
        val tvDataReceived : TextView = findViewById(R.id.tvDataReceived)
        val fNameReceived : String? = intent.getStringExtra("fName")
        tvDataReceived.text = getString(R.string.registration_thanks, fNameReceived)
        thirdButton.setOnClickListener{
            val intentBack : Intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intentBack)
        }
    }
}