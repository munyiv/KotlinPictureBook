package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SportsActivity : AppCompatActivity() {
    lateinit var btnNext2:Button
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)
        castView()
        clickNext()
    }
    fun castView(){
        btnNext2=findViewById(R.id.btnNext2)
        btnPrevious=findViewById(R.id.btnPrev)

    }
    fun clickNext(){
        btnPrevious.setOnClickListener {
            val previous=Intent(baseContext,MainActivity::class.java)
            startActivity(previous)
        }
        btnNext2.setOnClickListener {
            val next=Intent(baseContext,FlamingosActivity::class.java)
            startActivity(next)
        }
    }
}