package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class apppart2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apppart2)
        val ss = findViewById<Button>(R.id.button3)
        ss.setOnClickListener {
            val intent = Intent(this, cbiryani::class.java)
            startActivity(intent)
        }
        val ac = findViewById<Button>(R.id.button4)
        ac.setOnClickListener {
            val intent = Intent(this,pasta::class.java)
            startActivity(intent)
        }
        val ad = findViewById<Button>(R.id.button5)
        ad.setOnClickListener {
            val intent = Intent(this,noodles::class.java)
            startActivity(intent)
        }
        val ae = findViewById<Button>(R.id.button6)
        ae.setOnClickListener {
            val intent = Intent(this,brinjal::class.java)
            startActivity(intent)
        }
        val af = findViewById<Button>(R.id.button7)
        af.setOnClickListener {
            val intent = Intent(this,puloa::class.java)
            startActivity(intent)
        }
        val ag = findViewById<Button>(R.id.button11)
        ag.setOnClickListener {
            val intent = Intent(this,dal::class.java)
            startActivity(intent)
        }
        val ah = findViewById<Button>(R.id.button10)
        ah.setOnClickListener {
            val intent = Intent(this,kebab::class.java)
            startActivity(intent)
        }
    }
}