package com.example.changebackground

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var layout : RelativeLayout
    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var text    : TextView
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout  = findViewById(R.id.layoutRelative)
        button1 = findViewById(R.id.btCool)
        button2 = findViewById(R.id.btWarm)
        text    = findViewById(R.id.txtText)
        button1.setOnClickListener{
            layout.setBackgroundColor(R.color.cool)
        }
        button2.setOnClickListener{
            layout.setBackgroundColor(R.color.warm)
        }
    }
}