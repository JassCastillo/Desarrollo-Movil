package com.example.dosactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object EXTRA {
        const val EXTRA_MESSAGE = "com.example.android.dosactividades.MESSAGE"
        const val TEXT_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun  lanzarSegundaActivity(view: View) {
        val intent = Intent(this, Segunda::class.java)
        val textoEdit:EditText = findViewById(R.id.etPrimerNumero)
        val message = textoEdit.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val respCabecera: TextView = findViewById(R.id.mensajeRecibido)
        val respDato: TextView = findViewById(R.id.datoRecibido)
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val resp: String? = data!!.getStringExtra(Segunda.EXTRA_REPLY)
                respDato.text = resp
                respCabecera.visibility = View.VISIBLE
                respDato.visibility = View.VISIBLE
            }
        }
    }
}
