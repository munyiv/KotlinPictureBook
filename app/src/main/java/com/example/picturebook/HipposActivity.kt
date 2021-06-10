package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HipposActivity : AppCompatActivity() {
    lateinit var btnNext15: Button
    lateinit var btnPrevious: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hippos)
        castView()
        clickNext()
    }
    fun castView(){
        btnNext15=findViewById(R.id.btnNext15)
        btnPrevious=findViewById(R.id.btnPrev15)

    }
    fun clickNext(){
        btnPrevious.setOnClickListener {
            val previous= Intent(baseContext,FlamingosActivity::class.java)
            startActivity(previous)
        }
        btnNext15.setOnClickListener {
            val next= Intent(baseContext,HotelsActivity::class.java)
            startActivity(next)
        }
    }
}