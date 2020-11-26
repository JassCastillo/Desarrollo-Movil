fun main ()
{
val fecha = Date()
val hoy = if (fecha.year == 2019) true else false

    println("la fecha de hoy es $hoy")

var edad

    readline(println("Digite su edad: "))
    if(edad >= 18)
    {
    println("eres mayor de edad")
    } else {
    println("aun eres menor")
    }

}