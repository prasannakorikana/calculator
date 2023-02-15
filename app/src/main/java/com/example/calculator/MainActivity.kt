package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        android.os.Handler().postDelayed({display()},3000)

    }
    private fun display(){
        startActivity(Intent(this,MainActivity2::class.java))
        finish()
    }
}