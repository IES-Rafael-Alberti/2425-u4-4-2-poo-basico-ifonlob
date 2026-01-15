package org.iesra

class Estudiante(private val nombre : String){
    private var nota : Double = 0.0

    fun setNota(valor: Double) {
        if (valor < 0.0 || valor > 10.0) {
            throw IllegalArgumentException("La nota debe estar entre 0 y 10.")
        }
        nota = valor
    }

    fun getNota(): Double {
        return nota
    }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota=$nota"
    }
}