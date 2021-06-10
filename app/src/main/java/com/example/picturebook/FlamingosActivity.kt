package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FlamingosActivity : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnPrevious: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flamingos)
        castView()
        clickNext()
    }
    fun castView(){
        btnNext3=findViewById(R.id.btnNext3)
        btnPrevious=findViewById(R.id.btnPrev2)

    }
    fun clickNext(){
        btnPrevious.setOnClickListener {
            val previous= Intent(baseContext,SportsActivity::class.java)
            startActivity(previous)
        }
        btnNext3.setOnClickListener {
            val next= Intent(baseContext,HipposActivity::class.java)
            startActivity(next)
        }
    }
}