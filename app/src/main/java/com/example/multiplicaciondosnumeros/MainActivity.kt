package com.example.multiplicaciondosnumeros

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumero1: EditText
    private lateinit var edtNumero2: EditText
    private lateinit var btnMultiplicar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        txtResultado = findViewById(R.id.txtResultado)

        btnMultiplicar.setOnClickListener {
            val num1 = edtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = edtNumero2.text.toString().toIntOrNull() ?: 0

            val resultado = multiplicar(num1, num2)

            txtResultado.text = "Resultado: $resultado"
        }
    }

    private fun multiplicar(numero1: Int, numero2: Int): Int {
        return numero1 * numero2
    }
}