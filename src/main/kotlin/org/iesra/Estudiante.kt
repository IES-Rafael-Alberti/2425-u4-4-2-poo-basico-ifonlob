package org.iesra

class Estudiante(private val nombre : String){
    var nota : Double = 0.0
        set(value){
            if(value < 0.0 || value > 10.0){
                throw IllegalArgumentException("La nota debe estar entre 0 y 10.")
            }
            field = value
        }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota=$nota"
    }
}
