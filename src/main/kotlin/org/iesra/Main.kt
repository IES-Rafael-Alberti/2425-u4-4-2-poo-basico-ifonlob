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

    /* EJERCICIO 3 */

    val libro1 = Libro("Libro 1","Joe Flows",150,true)
    val libro2 = Libro("Libro 2","David Flores",236,false)
    println(libro1)
    println(libro2)
    try{
        val libro3 = Libro("","María Olivares",260,false)
    }
    catch (e : IllegalArgumentException){
        println("El título o el autor del libro no pueden estar vacíos.")
    }
}