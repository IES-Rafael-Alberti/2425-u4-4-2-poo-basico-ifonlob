package org.iesra

class Producto(private val nombre : String, private val precio : Double, private var stock : Int) {
    init {
        if (precio <= 0.0) {
            throw IllegalArgumentException("El precio debe ser positivo.")
        }
        if (stock < 0) {
            throw IllegalArgumentException("El stock no puede ser negativo.")
        }
    }

    override fun toString(): String {
        return "Producto: ${this.nombre}, Precio: ${this.precio}€, Stock: ${this.stock}"
    }

    fun vender(cantidad: Int) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("La cantidad a vender debe ser mayor que 0.")
            if (cantidad > stock) {
                throw IllegalArgumentException("La cantidad que se quiere vender tiene que ser menor que el stock disponible. Stock disponible : ${this.stock}")
            }
            this.stock -= cantidad
        }
    }
    fun reabastecer(cantidad: Int) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("La cantidad a reabastecer debe ser mayor que 0.")
        }
        this.stock += cantidad
        }
    }
