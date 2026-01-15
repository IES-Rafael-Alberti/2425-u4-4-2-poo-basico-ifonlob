class CuentaBancaria(private val titular : String, private val saldo : Double = 0.0){
    fun ingresar(cantidad : Double){
        if(cantidad <= 0){
            throw IllegalArgumentException("La cantidad a ingresar tiene que ser mayor que 0.")
        }
        this.saldo += saldo
        println("Saldo restante : ${this.saldo}")
    }

    fun retirar(cantidad : Double){
        if(cantidad > this.saldo){
            throw IllegalArgumentException("La cantidad a retirar no puede ser mayor que el saldo actual.")
        }
        this.saldo += cantidad
        println("Saldo restante : ${this.saldo}")
    }
}