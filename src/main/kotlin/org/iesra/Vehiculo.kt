package org.iesra

class Vehiculo (private val marca : String, private val modelo : String, private var kilometraje : Double = 0.0){

    fun registrarViaje(kilometros : Double){
        this.kilometraje += kilometros
    }

    fun detalles() : String {
        return "Coche ${this.marca} de modelo ${this.modelo} con un kilometraje de ${this.kilometraje}"
    }
}