package Kotlin

class Personaje2(val nombre: String, var vida: Int, var ataque: Int) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}

fun main() {
    val goku = Personaje2("Goku", 100, 50)
    goku.mostrarInfo()
}

//En koltin declarar clases es más conciso que en Java, puedes poner las variables de la clase
//en la declaración de la misma, además el constructor se asume no hace falta escribirlo