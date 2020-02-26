package Model
open class Persona ( ) {
    private var nombre: String = ""
    private var edad: Int = 0
    private var DNI: String = ""
    private var sexo: Char = 'M'
    private var peso: Double = 0.0
    private var altura: Double = 0.0
    constructor(nombre:String,edad:Int,secxo:Char) : this()
    constructor(nombre:String,edad:Int,secxo:Char,DNI:String,peso:Double,altura:Double):this()
   fun calcularIMC()
    {

    }

    fun esMayorDeEdad():Boolean
    {
    if(this.edad>=18)
    return true
    return false
    }

    fun comprobarSexo(sexo:Char)
    {
   if(sexo!='M' || sexo!='H')
  {
    this.sexo='H'
  }
    }

    fun generaDNI()
    {

    }
    override fun toString(): String {

        return super.toString() + "Nombre $nombre \nEdad: $edad "
    }
}
