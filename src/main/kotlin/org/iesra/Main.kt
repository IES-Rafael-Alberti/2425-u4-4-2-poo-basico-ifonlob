package org.iesra

fun main(){

    /* EJERCICIO 1 */

    val cuenta = CuentaBancaria("Juan")
    cuenta.ingresar(100.0)
    cuenta.retirar(50.0)
    try{
        cuenta.retirar(400.0)
    }
    catch(e : IllegalArgumentException){
        println("La cantidad a retirar no puede ser mayor que el saldo actual.")
    }

    /* EJERCICIO 2 */

    val vehiculo = Vehiculo("Toyota","Hybrid")
    vehiculo.registrarViaje(100.0)
    println(vehiculo.detalles())


}