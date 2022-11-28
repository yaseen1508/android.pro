package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainActivity = findViewById<Button>(R.id.b100)
        mainActivity.setOnClickListener {
            val intent = Intent(this@MainActivity,apppart2::class.java)
            startActivity(intent)
        }


        }
    }
