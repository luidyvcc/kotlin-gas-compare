package com.example.comparadorcombustivel

import java.io.Serializable

data class Posto (
    var nome: String,
    var valorGasolina: Float,
    var valorAlcool: Float
    ) : Serializable {
    override fun toString(): String {
        return this.nome
    }
}