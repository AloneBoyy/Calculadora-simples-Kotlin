package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //entradas

        val peso: EditText = findViewById(R.id.pesoBP)

        val texto: TextView = findViewById(R.id.txt1)


        //processos

        //convertendo objetos Editables para Double
        val pesoBP = peso.text.toString().toDouble()

        //calculadora Simples


        //saídas
    }
}