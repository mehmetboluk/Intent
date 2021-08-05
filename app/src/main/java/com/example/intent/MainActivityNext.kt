package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_next.*

class MainActivityNext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_next)

        val intent = intent
        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val age = intent.getIntExtra("age", 0)
        val country = intent.getStringExtra("country")

        tvInfo.text = "Your Info:\n" +
                "Name: ${name}\n" +
                "Surname: ${surname}\n" +
                "Age: ${age}\n" +
                "Country: ${country}"
    }
}