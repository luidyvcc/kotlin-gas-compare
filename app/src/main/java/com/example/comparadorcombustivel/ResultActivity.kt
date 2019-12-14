package com.example.comparadorcombustivel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_result)

        val intent = intent
        if (intent != null) {

            val valGas = intent.getStringExtra("gasolina").toFloat()
            val valAlc = intent.getStringExtra("alcool").toFloat()
            var textRes = "Use Drogas!";

            if ( valGas > 0 && valAlc > 0 ) {
                textRes = if (valGas*0.7 > valAlc) "Use Alcool!" else "Use Gasolina!"
            }

            resultado.setText(textRes)

            Log.i("VERIFICA", textRes)

        }

    }

}
