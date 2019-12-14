package com.example.comparadorcombustivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_lista_postos.*

class ListaPostosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista_postos)


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, postos)
        var lista = lstpostos
        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked item : $position",Toast.LENGTH_SHORT).show()

            val intent = Intent(this@ListaPostosActivity, ResultActivity::class.java)
            intent.putExtra("alcool", postos[position].valorAlcool.toString())
            intent.putExtra("gasolina", postos[position].valorGasolina.toString())
            startActivity(intent)
        }


    }

    companion object {
        internal val postos = arrayListOf<Posto>(
            Posto("Posto A", 4.15f,2.87f),
            Posto("Posto B", 4.60f,2.15f),
            Posto("Posto C", 4.00f,2.30f),
            Posto("Posto D", 4.30f,1.98f),
            Posto("Posto E", 3.00f,2.99f)
        )
    }

}
