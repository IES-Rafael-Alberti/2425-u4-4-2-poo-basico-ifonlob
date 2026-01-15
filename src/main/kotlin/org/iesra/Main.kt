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

    /* EJERCICIO 4 */

    val estudiante1 = Estudiante("Ana")
    val estudiante2 = Estudiante("Luis")
    val estudiante3 = Estudiante("María")

    estudiante1.setNota(8.5)
    estudiante2.setNota(6.0)

    try {
        estudiante3.setNota(11.0)
    } catch (e: IllegalArgumentException) {
        println("La nota debe estar entre 0 y 10.")
    }

    try {
        estudiante2.setNota(-1.0)
    } catch (e: IllegalArgumentException) {
        println("La nota debe estar entre 0 y 10.")
    }

    println(estudiante1)
    println(estudiante2)
    println(estudiante3)

    /* EJERCICIO 5 */

    val producto1 = Producto("Teclado", 29.99, 10)
    val producto2 = Producto("Ratón", 59.99, 5)

    println(producto1)
    println(producto2)

    producto1.vender(3)
    producto2.vender(2)

    producto2.reabastecer(10)

    try {
        producto1.vender(100)
    } catch (e: IllegalArgumentException) {
        throw IllegalArgumentException("La cantidad que se quiere vender tiene que ser menor que el stock disponible.")
    }

    println(producto1)
    println(producto2)
}