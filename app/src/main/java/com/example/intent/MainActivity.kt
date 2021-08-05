package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnNext.setOnClickListener {
            val intent = Intent(applicationContext, MainActivityNext::class.java)
            intent.putExtra("name", etName.text.toString())
            intent.putExtra("surname", etSurname.text.toString())
            intent.putExtra("age", etAge.text.toString().toInt())
            intent.putExtra("country", etCountry.text.toString())
            startActivity(intent)
        }

    }
}