package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HotelsActivity : AppCompatActivity() {
    lateinit var btnNext4: Button
    lateinit var btnPrevious: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotels)
        castView()
        clickNext()
    }
    fun castView(){
        btnNext4=findViewById(R.id.btnNext4)
        btnPrevious=findViewById(R.id.btnPrev4)

    }
    fun clickNext(){
        btnPrevious.setOnClickListener {
            val previous= Intent(baseContext,HipposActivity::class.java)
            startActivity(previous)
        }
        btnNext4.setOnClickListener {
            val next= Intent(baseContext,MainActivity::class.java)
            startActivity(next)
        }
    }
}