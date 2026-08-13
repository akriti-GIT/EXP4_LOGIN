package com.example.exp4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvUsn = findViewById<TextView>(R.id.tvUsn)

        val name = intent.getStringExtra("USER_NAME")
        val usn = intent.getStringExtra("USER_USN")

        tvName.text = "User Name: $name"
        tvUsn.text = "USN: $usn"
    }
}