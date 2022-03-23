package com.aula.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IMC_Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_resultado)
    }

    override fun onStart() {
        super.onStart()

        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)
        val txt_result = findViewById<TextView>(R.id.txt_resul)
        var mensagem: String = ""

        val imc = intent.extras?.getDouble("result")

        txt_resultado.text = "IMC: " + String.format("%.2f",imc)


        if (imc != null) {
            if (imc < 16.0)
                mensagem = "Sem classificação"
            else if (imc >= 16.0 && imc <= 16.9)
                mensagem = "Muito abaixo do peso"
            else if (imc >= 17.0 && imc <= 18.4)
                mensagem = "Abaixo do peso"
            else if (imc >= 18.5 && imc <= 24.9)
                mensagem = "Peso normal"
            else if (imc >= 25.0 && imc <= 29.9)
                mensagem = "Acima do peso"
            else if (imc >= 30.0 && imc <= 34.9)
                mensagem = "Obesidade grau I"
            else if (imc >= 35.0 && imc <= 40.0)
                mensagem = "Obesidade grau II"
            else if (imc > 40.0)
                mensagem = "Obesidade grau III"
        }else{
            mensagem = "ERRO!!!"
        }

        txt_result.text = mensagem
    }
}