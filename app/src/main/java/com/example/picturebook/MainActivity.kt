package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView()
        clickNext()
    }
    fun castView(){
     buton=findViewById(R.id.btnNext1)
    }
    fun clickNext(){
        buton.setOnClickListener {
            var intent=Intent(baseContext,SportsActivity::class.java)
            startActivity(intent)

        }
//        var intent=Intent(baseContext,SportsActivity::class.java)
//        startActivity(intent)



    }
}