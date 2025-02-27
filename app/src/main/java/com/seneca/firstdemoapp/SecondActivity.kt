package com.seneca.firstdemoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val firstName : TextView = findViewById(R.id.edFirstName)
        
        val secButton : Button = findViewById(R.id.secButton)
        secButton.setOnClickListener{
            val intentGoToThirdActivity = Intent(applicationContext, ThirdActivity::class.java)
            intentGoToThirdActivity.putExtra("fName", firstName.text.toString())
            startActivity(intentGoToThirdActivity)
        }

    }
}