fun main (args: Array<String>) {
 val procesador= listOf("Intel Core i3","Intel core i5","Intel core i7")
 val memoria= listOf("4GB","8GB","2GB")
 val disco= listOf("500","1T","2T")
val PCProcesador: MutableList<String> = mutableListOf()
 val PCmemoria: MutableList<String> = mutableListOf()
 val PCdisco: MutableList<String> = mutableListOf()
 var menu=0
var n=0

    Finallizar@   do {

        var menu=0
        var a = 0
        for (a in 0..2) {
     print(
         """
Agregue los componentes necesarios de la lista (teclee numero correspondiente):
1. Procesador
2. Memoria Ram
3. Disco duro 
""".trimIndent() + "\n"
     )
     val op = readLine()!!.toInt()
       print("\n" + "Teclee numero correspondrinte al componente deseado"  + "\n")
       when (op)
       {
           1 ->{ for (i in 0..2) {
               print("\n" + i + "." + procesador[i]+"\n")
           }
           PCProcesador.add(0, procesador.get(readLine()!!.toInt()))}
           2 ->{ for (i in 0..2) {
               print("\n" + i + "." + memoria[i]+"\n")
           }
               PCmemoria.add(0, memoria.get(readLine()!!.toInt()))}
           3->{ for (i in 0..2) {
               print("\n" + i + "." + disco[i]+"\n")
           }
               PCdisco.add(0, disco.get(readLine()!!.toInt()))}
           else ->print("Opcion invalida")
       }
a+1
 }

//regresar@for(i) {

    print(
        """
PC armado
1. Armar un nuevo equipo
2. Ver equipos armados
3. Salir
 """.trimIndent() + "\n"
    )

    menu = readLine()!!.toInt()

    if (menu == 2)
    {
        var n=0
        for (item in PCProcesador)
        {
            print("\n" + "Caracteisticas PC : procesador-" + PCProcesador[n] + "  memoria- " + PCmemoria[n] + " disco- " + PCdisco[n])
            n=n+1
        }
        print(
            """
        1. Armar un nuevo equipo
        2. Ver equipos armados
        3. Salir""" +"\n")
        menu = readLine()!!.toInt()
    }
//}
        if (menu==3)
        {
            break@Finallizar
        }
    }while (menu != 3)



}