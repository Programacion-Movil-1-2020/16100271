fun main ()
{var auto=Auto()
    Finallizar@   do {

        var menu=0
        var op=0
        var a = 0

            print("\n" +
                """
Ensamblador de autos:
1. Ensamblar Auto Nuevo
2. ver Auto ensamblado
3. salir 
""".trimIndent() + "\n"
            )
             op = readLine()!!.toInt()
            when (op) {
                1 -> {
                    auto.ensablar_Auto()
                }
                2 -> {
                    auto.ver_Auto()
                }
                3 -> {
                    break@Finallizar
                }
                else -> print("Opcion invalida")
            }

    }while(op!=3)
}
