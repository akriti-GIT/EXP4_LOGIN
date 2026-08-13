package com.example.exp4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etUsn = findViewById<EditText>(R.id.etUsn)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val name = etName.text.toString()
            val usn = etUsn.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("USER_NAME", name)
            intent.putExtra("USER_USN", usn)

            startActivity(intent)
        }
    }
}