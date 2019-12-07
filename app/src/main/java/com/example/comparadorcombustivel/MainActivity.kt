package com.example.comparadorcombustivel

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
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

            val inputManager:InputMethodManager =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(currentFocus?.windowToken, InputMethodManager.SHOW_FORCED)

        }

    }

}
