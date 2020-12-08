package com.example.dosactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Scrolling : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
    }
    fun  Regresarsegunda(view: View) {
        val intent = Intent(this,Segunda::class.java)
        startActivity(intent)
    }
}