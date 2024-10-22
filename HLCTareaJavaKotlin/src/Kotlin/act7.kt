package Kotlin

fun main() {
    println(multiplicar(5))

    // Lambda en Kotlin
    val operacion: (Int, Int) -> Int = { a, b -> a + b }
    println(operacion(3, 4))
}

fun multiplicar(num: Int): Int {
    return num * 2
}

//En kotlin no hace falta declarar interfaces para usar lambas y las funciones se pueden declarar
//sin especificar todos sus detalles