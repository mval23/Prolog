object tarea_2 {

    def ejercicio1(list: List[Char]): List[List[Char]] = {
        // cada elemento de la lista original se convierte en una lista de dos elementos (mayuscula y minuscula)
        val listaMayMin = list.map(letra => List(letra.toUpper, letra.toLower))
        listaMayMin
    }

    def ejercicio2(list: List[String]): List[String] = {
        // se filtran los nombres que tengan mas de 6 caracteres y que empiecen por A
        val listaFiltrada = list.filter(nombre => nombre.length() > 6 && nombre(0) == 'A')
        listaFiltrada
    }

    def ejercio3(list: List[Char]): Unit = {
        // se imprimen las vocales de la lista
        list.foreach { char =>
            val corresponde = List('a', 'e', 'i', 'o', 'u').contains(char.toLower)
            if (corresponde) {
                println(char)
            }
        }
    }

    def ejercio4(lista: List[Int]): List[Int] = {
        def multiplicar(lista: List[Int], listaResultado: List[Int]): List[Int] = {
            lista match {
                case Nil => listaResultado // si la lista esta vacia, se retorna la lista resultado
                case n1 :: resto => // si la lista no esta vacia, se procesa el primer elemento y se llama recursivamente a la funcion
                    val num = if (n1 % 2 == 1) n1 * 2 else n1
                    val listaResultado2 = if (!listaResultado.contains(num)) num :: listaResultado else listaResultado
                    multiplicar(resto, listaResultado2)
            }
        }

        val listaPares = multiplicar(lista, List.empty[Int])
        listaPares.sorted(Ordering[Int].reverse)
    }

    def main(args: Array[String]): Unit = {

        // Test ejercicio 1
        val lista = List('a', 'B', 'c', 'd', 'e', 'M', 'j', 't')
        val resultado = ejercicio1(lista)
        println(resultado)

        // Test ejercicio 2
        val nombres = List("Andres", "Javier", "Alejandro", "Andrea", "Ana", "Andres")
        val resultado2 = ejercicio2(nombres)
        println(resultado2)

        // Test ejercicio 3
        val lista2 = List('a', 'B', 'c', 'd', 'e', 'M', 'U', 't', 'i', 'o', 'j', 't')
        ejercio3(lista2)

        // Test ejercicio 4
        val numeros = List(1, 2, 3, 4, 5, 6, 7)
        val resultado4 = ejercio4(numeros)
        println(resultado4)
    }
}
