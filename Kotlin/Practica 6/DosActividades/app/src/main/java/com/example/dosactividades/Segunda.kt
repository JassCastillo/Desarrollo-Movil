package com.example.dosactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Segunda : AppCompatActivity() {
    companion object EXTRA {
        val EXTRA_REPLY = "com.example.android.dosactividades.REPLY"
    }
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        val intent: Intent = intent
        val message: String? = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        val textView: TextView = findViewById(R.id.datoOptenido)

        textView.text = message

    }
    fun devolverRespuesta(view: View) {

        val mResp: EditText = findViewById(R.id.editRespuesta)
        val resp:String = mResp.text.toString()
        val respIntent = Intent()
        respIntent.putExtra(EXTRA_REPLY,resp)
        setResult(RESULT_OK,respIntent)
        finish()
    }
    fun  lanzarScrollin(view: View) {
        val intent = Intent(this,Scrolling ::class.java)
        startActivity(intent)
    }
    fun  lanzararitmetica(view: View) {
        val intent = Intent(this,Aritmetica ::class.java)
        startActivity(intent)
    }
}