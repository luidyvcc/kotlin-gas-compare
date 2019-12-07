package com.example.comparadorcombustivel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        verificar.setOnClickListener {

            var textRes = "Erro";
            var valGas: Float = gasolina.text.toString().toFloat()
            var valAlc: Float = alcool.text.toString().toFloat()

            if ( valGas > 0 && valAlc > 0 ) {
                textRes = if (valGas*0.7 > valAlc) "Use Alcool!" else "Use Gasolina!"
            }

            resultado.setText(textRes)

            Log.i("VERIFICA", textRes)
        }

    }

}
