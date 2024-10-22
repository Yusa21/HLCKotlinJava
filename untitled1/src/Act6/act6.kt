package Act6

fun act6(){
    var cont = true
    while (cont) {
        cont = false
        try {
            println("Cuanto daño hace?")
            var dmg = readln().toInt()
            if (dmg > 50) {
                println("Golpe crítico")
                dmg = dmg * 2
            }
            println("Hace $dmg de daño")
        } catch (e: Exception) {
            println("Elije un entero")
            cont = true
        }
    }


}
