package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MondayTTupdate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monday_ttupdate)

        val hr_1 = findViewById<TextView>(R.id.Monday_hour)
        val min_1 = findViewById<TextView>(R.id.Monday_minutes)
        val editText = findViewById<TextView>(R.id.Mon_Subject)
        val updateBut = findViewById<Button>(R.id.updateButton)

        updateBut.setOnClickListener {
            val subjectName = editText.toString()
            val hr1 = hr_1.toString()
            var min1 = min_1.toString()
            val intent = Intent(this, MondayTT::class.java)
            intent.putExtra("Name", subjectName)
            intent.putExtra("Hour", hr1)
            intent.putExtra("Min", min1)
            startActivity(intent)

        }
    }
}



