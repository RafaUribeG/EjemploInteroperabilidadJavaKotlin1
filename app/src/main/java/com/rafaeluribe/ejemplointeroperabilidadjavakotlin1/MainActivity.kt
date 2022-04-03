package com.rafaeluribe.ejemplointeroperabilidadjavakotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = Calculadora()

        //val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val txtResultado:TextView = findViewById(R.id.txtResultado)

        txtResultado.text = "La suma es: ${c.sumar(5,6)}"
    }
}