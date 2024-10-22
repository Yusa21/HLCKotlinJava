package Act5

fun act5() {
    var lv = 0
    var cont = true
    while (cont) {
        try {
            println("De que nivel es el personaje?")
            lv = readln().toInt()
            if (lv < 10) {
                println("Personaje principiante")
            } else if (lv <= 20) {
                println("Personaje intermedio")
            } else {
                println("Personaje avanzado")
            }
            cont = false
        } catch (e: NumberFormatException) {
            println("Eso no es un entero")
        }
    }




}