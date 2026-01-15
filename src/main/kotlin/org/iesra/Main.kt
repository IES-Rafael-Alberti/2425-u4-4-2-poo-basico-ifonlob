package org.iesra

fun main(){
    val cuenta = CuentaBancaria("Juan")
    cuenta.ingresar(100.0)
    cuenta.retirar(50.0)
    try{
        cuenta.retirar(400.0)
    }
    catch(e : IllegalArgumentException){
        println("La cantidad a retirar no puede ser mayor que el saldo actual.")
    }

}