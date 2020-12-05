fun main()
{
//numeros
val int = 123
val long = 123456L
val double = 12.34
val float = 12.34F
val hexadecimal = 0xAB
val binary = 0b01010101
 
    println("Numeros")
    println(int)
    println(long)
    println(double)
    println(float)
    println(hexadecimal)
    println(binary)

// Boleanos

val x = 1
val y = 2
val z = 2
val esTrue = x < y && x < z
val otroTrue = x == y || y == z

    println("Boleanos")
    println(x)
    println(y)
    println(z)
    println(esTrue)
    println(otroTrue)  

//Cadenas
val string = "string con \n una línea nueva"
val rawString = """
 raw string es útil para
 cadenas con muchas lineas
 """
    println("Cadenas")
    println(string+rawString)
}
