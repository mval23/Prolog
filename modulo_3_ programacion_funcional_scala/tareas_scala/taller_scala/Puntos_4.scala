object Puntos_4 {
    // Función de orden superior minDistancia
    def minDistancia(puntos: List[(Double, Double)], distancia: ((Double, Double), (Double, Double)) => Double): Double = {
        // Inicializa la distancia mínima con un valor alto
        var distanciaMinima = Double.MaxValue

        // Calcula la distancia mínima entre todos los pares de puntos
        for {
            // Asignar las variables punto1 y punto2
            punto1 <- puntos
            punto2 <- puntos if punto1 != punto2
        } {
            // Calcula la distancia entre punto1 y punto2
            val dist = distancia(punto1, punto2)
            if (dist < distanciaMinima) {
                distanciaMinima = dist
            }
        }

        distanciaMinima
    }

    def main(args: Array[String]): Unit = {
        // Ejemplo de uso de minDistancia
        val puntos = List((1.0, 2.0), (3.0, 4.0), (5.0, 6.0), (7.0, 8.0))

        // Ejemplo de una función para calcular la distancia entre dos puntos (euclidiana)
        def distanciaEuclidiana(punto1: (Double, Double), punto2: (Double, Double)): Double = {
            val dx = punto1._1 - punto2._1
            val dy = punto1._2 - punto2._2
            Math.sqrt(dx * dx + dy * dy)
        }

        val distanciaMin = minDistancia(puntos, distanciaEuclidiana)
        println(s"\nLa distancia mínima entre los puntos es: $distanciaMin")

        // Ejemplo de una función para calcular la distancia de Manhattan entre dos puntos
        def distanciaManhattan(punto1: (Double, Double), punto2: (Double, Double)): Double = {
            val dx = Math.abs(punto1._1 - punto2._1)
            val dy = Math.abs(punto1._2 - punto2._2)
            dx + dy
        }

        val distanciaMin2 = minDistancia(puntos, distanciaManhattan)
        println(s"\nLa distancia mínima entre los puntos es: $distanciaMin2")
    }
}