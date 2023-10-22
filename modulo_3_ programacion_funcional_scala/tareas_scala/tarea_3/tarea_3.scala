object tarea_3 {
    def separarAutomoviles(placas: List[String]): List[String] = {
        // Contienen 3 letras, espacio en blanco, seguidas de 3 números.
        val formatoA = """[A-Z]{3}\s\d{3}""".r
        // se filtran las placas que cumplan con el formato de automovil
        placas.filter(placa => formatoA.pattern.matcher(placa).matches())
    }

    def separarVehiculosCarga(placas: List[String]): List[String] = {
        // Contienen 3 números, espacio en blanco, seguidas de una letra.
        val formatoVc = """\d{3}\s[A-Z]""".r
        // se filtran las placas que cumplan con el formato de vehiculo de carga
        placas.filter(placa => formatoVc.pattern.matcher(placa).matches())
    }

    def separarMotos(placas: List[String]): List[String] = {
        // Contienen 4 o 5 letras, seguidas de 3 números.
        val formatoM = """[A-Z]{4,5}\d{3}""".r
        // se filtran las placas que cumplan con el formato de moto
        placas.filter(placa => formatoM.pattern.matcher(placa).matches())
    }

    def main(args: Array[String]): Unit = {
        // Test tarea 3
        val listaPlacas = List(
            "XNF 400", "JFKE23", "324 E", "FJF 434",
            "ABC 123", "456 X", "XYZ 789",
            "MOT123", "QWE4567", "RTYUI234", "ABCDE12345",
            "123 K", "987 L", "543 S", "321 T", "678 UG",
            "KLMNO123", "PQRST2345", "UVWXY678", "ZABCD234", "EHI3456", "FGJH7890"
        )
        val automoviles = separarAutomoviles(listaPlacas)
        val vehiculoCarga = separarVehiculosCarga(listaPlacas)
        val motos = separarMotos(listaPlacas)

        println("Placas de automóviles: ")
        for (auto <- automoviles) {
            println(auto)
        }
        println("Placas de vehículos de carga:")
        for (vCarga <- vehiculoCarga) {
            println(vCarga)
        }
        println("Placas de motos: ")
        for (moto <- motos) {
            println(moto)
        }
    }
}

