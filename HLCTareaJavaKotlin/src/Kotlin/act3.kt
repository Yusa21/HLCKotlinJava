package Kotlin


fun main() {
    val cofres = arrayOf("Espada", "Escudo", "Poción")
    cofres.forEach {
        println("Has encontrado: $it")
    }
}

//Kotlin simplifica sobre todo los bucles for, que son más rapidos de declarar
//tambien es más sencillo hacer un forEach de de un vector