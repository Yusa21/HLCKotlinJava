import Act1.act1
import Act10.act10
import Act2.act2
import Act3.act3
import Act4.act4
import Act5.act5
import Act6.act6
import Act7.act7
import Act8.act8
import Act9.act9

fun main() {
    var cont = true
    while (cont) {
        println(
            "Elige un ejercicio:\n" +
                    "\t1.Act 1\n" +
                    "\t2.Act 2\n" +
                    "\t3.Act 3\n" +
                    "\t4.Act 4\n" +
                    "\t5.Act 5\n" +
                    "\t6.Act 6\n" +
                    "\t7.Act 7\n" +
                    "\t8.Act 8\n" +
                    "\t9.Act 9\n" +
                    "\t10.Act 10\n" +
                    "\t11.Salir"
        )
        var opt = readLine()
        when (opt) {
            "1" -> act1()
            "2" -> act2()
            "3" -> act3()
            "4" -> act4()
            "5" -> act5()
            "6" -> act6()
            "7" -> act7()
            "8" -> act8()
            "9" -> act9()
            "10" -> act10()
            else -> {
                println("Esa opción no es valida")
            }

        }
    }
}