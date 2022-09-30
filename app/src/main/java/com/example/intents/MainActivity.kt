package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.pg)
        buttonClick.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)

        }


        val ButtonClick = findViewById<Button>(R.id.web)
        buttonClick.setOnClickListener {
            val webIntent: Intent = Uri.parse("https://zalegoacademy.ac.ke/").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
        }



    }
}

