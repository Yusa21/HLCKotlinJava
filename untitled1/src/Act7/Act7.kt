package Act7

fun act7() {
    var i = true
    var hp1 = 10
    var hp2 = 20
    var atk1 = 5
    var atk2 = 10
    while (i) {
        println("Personaje 1 ataca hace $atk1 de daño")
        hp2 = atack(atk1, hp2)
        println("Personaje 2 ataca hace $atk2 de daño")
        hp1 = atack(atk2, hp1)

        println("Personaje 1: $hp1")
        println("Personaje 2: $hp2")

        //Los dos tienen cero de vida
        if (hp1 + hp2 == 0) {
            println("EMPATE")
            i = false
        } else if (hp1 == 0) {
            println("GANA personaje 1")
            i = false
        } else if (hp2 == 0) {
            println("GANA personaje 2")
            i = false
        }


    }
}

fun atack(dmg: Int, hp: Int): Int {
    var hitPoint = hp
    hitPoint = hitPoint - dmg
    if (hitPoint < 0) {
        hitPoint = 0
    }
    return hitPoint
}