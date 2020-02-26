package Model

open class Password()
{
    private var longitud: Int = 8
    private var contrasena: String = ""

    fun esFuerte()
    {}
    fun generarPassword()
    {}

    fun getcontrasena():String{
        return contrasena
    }

    fun getlongitud():Int{
        return longitud
    }
    fun setlongitud(longitud: Int){
        this.longitud = longitud
    }
}