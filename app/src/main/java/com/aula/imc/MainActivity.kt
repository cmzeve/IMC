package com.aula.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val etx_peso = findViewById<EditText>(R.id.etx_peso)
        val etx_altura = findViewById<EditText>(R.id.etx_altura)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        btn_calcular.setOnClickListener{
            val peso = etx_peso.text.toString().toDouble()
            val altura = etx_altura.text.toString().toDouble()

            val imc = peso / (altura * altura)

            //txt_resultado.text ="IMC: " + String.format("%.2f",imc)

            val resultadoIntent = Intent(this, IMC_Resultado::class.java)

            resultadoIntent.putExtra("result", imc)

            startActivity(resultadoIntent)

        }


    }
}