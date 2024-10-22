package Act8

fun act8() {
    var inventario: MutableList<String> = emptyList<String>().toMutableList()
    var cont = true
    var opt: String
    while (cont) {
        println(
            "Elije una opción:\n" +
                    "\t 1.Añadir objeto\n" +
                    "\t 2.Eliminar objeto\n" +
                    "\t 3.Listar inventario\n" +
                    "\t 4.Salir"
        )
        opt = readln()
        when (opt) {
            "1" -> inventario = addItem(inventario)
            "2" -> inventario = removeItem(inventario)
            "3" -> listItems(inventario)
            "4" -> cont = false
            else -> {
                print("Esa opción no es valida")
            }


        }
    }



}

fun addItem(inventario: MutableList<String>): MutableList<String> {
    println("Que quieres añadir?")
    val item = readln()
    inventario.add(item)
    return inventario
}

fun removeItem(inventario: MutableList<String>): MutableList<String> {
    println("Que quieres eliminar?")
    val item = readln()
    inventario.remove(item)
    return inventario
}

fun listItems(inventario: MutableList<String>) {
    inventario.forEach {item->
        println(item)
    }
}