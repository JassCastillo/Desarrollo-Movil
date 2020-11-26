class Estudiante( nombre:String, apellido:String,
    var asignatura:String,
    var profesor:String):
    Persona(nombre,apellido)

open class Persona(var nombre:String, var apellido:String)


fun main()
{
    var estudiante:String=("Gerardo","Castillo")
    
    println("Asignatura: ${estudiante.asignatura} con ${Persona.nombre}")

}
 
