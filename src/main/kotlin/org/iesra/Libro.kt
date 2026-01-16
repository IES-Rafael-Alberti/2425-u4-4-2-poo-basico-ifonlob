package org.iesra

class Libro(private val titulo : String,private val autor : String,private val numPaginas : Int = 100, private var leido : Boolean = false){
    constructor(titulo: String, autor: String) : this(
        titulo = titulo,
        autor = autor,
        numPaginas = 100,
        leido = false
    )

    init{
        if (numPaginas <= 0 || numPaginas > 5000){
            throw IllegalArgumentException("Un libro no puede contener páginas negativas (máx 5000")
        }
        if(titulo.isBlank()|| autor .isBlank()){
            throw IllegalArgumentException("El título o el autor del libro no pueden estar vacíos.")
        }
    }

    override fun toString() : String {
        return "Libro: ${this.titulo} por ${this.autor}, Páginas: ${this.numPaginas}, Leído: ${if(this.leido) "Sí" else "No"}"
    }
}