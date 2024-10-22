package Act3

fun act3(){
    var atk1 = 2
    var atk2 = 5
    var atk3 = 300
    println("El primer ataque es $atk1")
    println("Multiplicado es ${multiplicarAtaques(atk1)}")
    println("El segundo ataque es $atk2")
    println("Multiplicado es ${multiplicarAtaques(atk2)}")
    println("El tercer primer ataque es $atk3")
    println("Multiplicado es ${multiplicarAtaques(atk3)}")
}

fun multiplicarAtaques(atk: Int): Int{
    return atk*5
}