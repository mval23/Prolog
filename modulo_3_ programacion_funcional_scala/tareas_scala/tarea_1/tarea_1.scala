object tarea_1 {
    //no tocar esat parte del codigo, son los casos de prueba
    def main(args: Array[String]): Unit = {

        val w = new Persona("Javier", 18, 2873, 80, 1.8)
        val t = new Trabajador("Andres", 16, 12930, 60, 2, "Desarrollador web")
        val Numero = scala.io.StdIn.readInt()

        var result = (x: Int) => x match {
            case 1 => println(w.calcularIMC())
            case 2 => println(w.esMayorDeEdad())
            case 3 => println(w.presentacion())
            case 4 => println(t.esMayorDeEdad())
            case 5 => println(t.infoTrabajo())
        }
        result(Numero)

    }


    class Persona(nombre: String, edad: Int, cedula: Int, peso: Double, altura: Double) {
        def calcularIMC(): Double = {
            val imc = peso / (altura * altura)
            return imc
        } //aqui va su codigo

        def esMayorDeEdad(): Boolean = {
            val v = edad >= 18
            return v
        } //aqui va su codigo

        def presentacion(): String = {
            return "Hola!, mi nombre es " + nombre + " con cedula " + cedula + " y tengo " + edad
        } //aqui va su codigo
    }

    class Trabajador(nombre: String, edad: Int, cedula: Int, peso: Double, altura: Double, profesion: String) extends Persona(nombre, edad, cedula, peso, altura) {
        def infoTrabajo(): String = {
            profesion
        }
    }
}