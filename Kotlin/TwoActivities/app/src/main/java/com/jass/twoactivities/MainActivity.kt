package com.jass.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object EXTRA {
        val EXTRA_MESSAGE = "com.example.android.dosactividades.MESSAGE"
        val TEXT_REQUEST = 1
    }

    fun lanzarSegundaActivity(view: View) {
        val intent = Intent(this, Segunda::class.java)
        val textoEdit: EditText = findViewById(R.id.editNombre)
        val message = textoEdit.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)

    }
}