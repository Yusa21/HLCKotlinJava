package Act9

fun act9(){
    var exp: Int = 0
    var lv: Int = 0
    var cont = true
    while(cont){
        println("Nivel: $lv Exp: $exp\n" +
                "\t1.Ganar batalla\n" +
                "\t2.Salir")
        var opt = readLine()
        if(opt == "1"){
            exp+=50
            if(exp>=200){
                lv+=1
                exp-=200
            }
        }else{
            cont = false
        }
    }

}