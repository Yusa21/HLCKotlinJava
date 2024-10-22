package Act10

fun act10(){
    val dmg1: Int = 10
    val dmg2: Int = 20
    var bossHp: Int = 200
    while (bossHp > 0){
        println("El equipo hace ${dmg1+dmg2} de daño")
        bossHp-=(dmg1+dmg2)
        println("Boss HP: $bossHp")
    }
    println("Boss derrotado")
}