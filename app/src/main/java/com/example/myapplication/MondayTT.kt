package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MondayTT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monday_tt2)

        var intent = intent
        var restext = intent.getStringExtra("Name")
        var hr_11 = intent.getStringExtra("Hour")
        var min_11 = intent.getStringExtra("Min")
        var sub = findViewById<TextView>(R.id.Subject1)
        sub.text = restext  + "\t" + hr_11 + "\t" + min_11
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