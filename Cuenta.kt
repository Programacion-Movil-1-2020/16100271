package Model

open class Cuenta ()
{
    private var titular : String =""
    private var cantidad : Double = 0.0
    constructor(titular:String):this()
    constructor(titular:String, cantidad:Double):this()
    fun settitular(titular: String){
        this.titular = titular
    }
    fun gettitular():String{
        return titular
    }
    fun setcantidad(cantidad: Double){
        this.cantidad = cantidad
    }
    fun getcantidad():Double{
        return cantidad
    }

  fun ingresar (cantidad:Double )
    {
        if(cantidad<=0)
        {

        }
        else
        {
          this.cantidad+=cantidad
        }
    }
    fun retirar (cantidad:Double)
    {
        this.cantidad-=cantidad
        if(cantidad<=0)
        {
            this.cantidad= 0.0
        }
    }

    override fun toString(): String {

        return super.toString() + "Titular: $titular \nCantidad: $cantidad "
    }
}
