package com.example.dosactividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Aritmetica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aritmetica)
    }
    fun realizarSuma(botonSumar: Button) {
        val primerTexto: EditText = findViewById(R.id.etPrimerNumero)
        val segundoTexto: EditText = findViewById(R.id.etSegundoNumero)
        val primerValor:Int = primerTexto.text.toString().toInt()
        val segundoValor:Int = segundoTexto.text.toString().toInt()
        var resultadoFinal:Int = 0
        resultadoFinal = primerValor!! + segundoValor!!
        val resultadoSuma: TextView = findViewById(R.id.etResultadoSuma)
        var resultadoTexto = resources.getString(R.string.resultado_aritmetica)
        resultadoSuma.text = "${resultadoTexto} $resultadoFinal"
        Toast.makeText(this,"La suma es $resultadoFinal", Toast.LENGTH_SHORT).show()
    }
    fun sumar(view: View) {
        val botonSumar: Button = findViewById(R.id.btSuma)
        botonSumar.setOnClickListener{realizarSuma(botonSumar)}
    }
}