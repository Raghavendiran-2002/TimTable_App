package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MondayTT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monday_tt2)
        val addTT = findViewById<FloatingActionButton>(R.id.AddTT)
        addTT.setOnClickListener{
            val intent = Intent(this, MondayTTupdate::class.java)
            startActivity(intent)
        }
        val back = findViewById<Button>(R.id.BackMonTT)
        back.setOnClickListener{
            Intent(this, MainActivity::class.java)
            finish()
        }
    }
}