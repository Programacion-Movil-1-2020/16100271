
class Auto {
    var marca:MutableList<String> = mutableListOf()
    var modelo:MutableList<String> = mutableListOf()
    val caracteristicas: MutableList<String> = mutableListOf()
    val caracteristicasEspeciales: MutableList<String> = mutableListOf()

    fun ensablar_Auto()
    {
        println("Ingrese la marca del Auto: ")
         marca.add(readLine()!!)
        println("Ingrese el modelo del Auto: ")
        modelo.add( readLine()!!)

        print("\n" + "Tecle el numero correspondiente a la caracteristica del auto"  + "\n")
        print(
            """
1. Aire acondicionado
2. Frenos ABS
3. Bolsas de aire
4.Pantalla tactil
5.Controles electricos

""".trimIndent() + "\n")
        val op = readLine()!!.toInt()
        when (op)
        {
            1 ->{
                caracteristicas.add("Aire acondicionado")
            }
            2 ->{
                caracteristicas.add("Frenos ABS")
            }
            3->{ caracteristicas.add("Bolsas de aire")
            }
            4->{ caracteristicas.add("Pantalla tactil")
            }
            5->{ caracteristicas.add("Controles electricos")
        }
            else ->print(" ")
        }


            print("\n" + "Tecle el numero correspondiente a las caracteristicas especiales del auto" + "\n")
            print(
                """
1. Faros de niebla
2. Faros de LED
3. Asientos de piel
4. Rines de 17 pulgadas
5. Monitoreo punto ciego

""".trimIndent() + "\n"
            )
            val es = readLine()!!.toInt()
            when (es) {
                1 -> {
                    caracteristicasEspeciales.add("Faros de niebla")
                }
                2 -> {
                    caracteristicasEspeciales.add("Faros de LED")
                }
                3 -> {
                    caracteristicasEspeciales.add("Asientos de piel")
                }
                4 -> {
                    caracteristicasEspeciales.add("Rines de 17 pulgadas")
                }
                5 -> {
                    caracteristicasEspeciales.add("Monitoreo de punto ciego")
                }
                else -> print(" ")
            }

    }

    fun ver_Auto()
    {
        var n=0
        for (item in caracteristicas)
        {
            print("\n" +"Auto: "+marca[n]+" modelo: "+modelo[n]+ " Caracteisticas del auto :" + caracteristicas[n]+" Caracteisticas especiales del auto: "+caracteristicasEspeciales[n])
            n=n+1
        }
        print("\n" +"numero de autos registrados: "+n)
    }
}