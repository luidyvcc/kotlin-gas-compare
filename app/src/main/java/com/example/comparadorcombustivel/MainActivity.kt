package com.example.comparadorcombustivel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaPostos.setOnClickListener {
            val intent = Intent(this@MainActivity, ListaPostosActivity::class.java)
            startActivity(intent)
        }

        verificar.setOnClickListener {

            val inputManager:InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(currentFocus?.windowToken, InputMethodManager.SHOW_FORCED)

            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("gasolina", gasolina.text.toString())
            intent.putExtra("alcool", alcool.text.toString())
            startActivity(intent)


        }

    }

}
