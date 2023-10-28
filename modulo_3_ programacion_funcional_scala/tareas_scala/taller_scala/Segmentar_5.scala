

object Segmentar_5 {
    def encontrarCorreos(cadena: String): List[String] = {
        // usuario + @ + dominio (mail.com, unal.edu.co y med.gov.co)
        val correoRegex = """([\w.]+)@(gmail\.com|unal\.edu\.co|med\.gov\.co)""".r
        correoRegex.findAllIn(cadena).toList
    }

    def encontrarNumerosCelular(cadena: String): List[String] = {
        // 3 números + - + 3 números + - + 2 números + - + 2 números
        val celularRegex = """([0-7]{3}-[0-7]{3}-[3-5]{2}-[3-5]{2})""".r
        celularRegex.findAllIn(cadena).toList
    }

    def encontrarDirecciones(cadena: String): List[String] = {
        // Cra o Cll + 2 números + # + 2 números + - + 1 número
        val direccionRegex = """(Cra|Cll) \d{2} # \d{2}-\d""".r
        direccionRegex.findAllIn(cadena).toList
    }

    def main(args: Array[String]): Unit = {
        val listaDeCadenas = List(
            "Mi correo es usuario@gmail.com y mi otro correo es ejemplo@unal.edu.co",
            "Mi número de celular es 321-765-43-45",
            "Puedes contactarme en el número 123-456-78-90",
            "Mi número de celular es 301-765-43-55 y mi otro número es 123-456-78-90",
            "Esta es una dirección válida: Cra 15 # 30-2",
            "dirección no válida: Cll 10 # 20-30",
            "Correo: info@med.gov.co",
            "Teléfono de contacto: 765-432-11-22",
            "Dirección: Cll 8 # 5-3",
            "Otro correo: test@example.com",
            "Teléfono: 555-555-55-55",
            "Dirección en formato incorrecto: Cra 40 # 99-XX",
            "Correo de soporte: support@estenosirve.org",
            "Dirección: Cra 1 # 2-3",
            "Teléfono: 123-456-78-90",
        )

        // Test correos
        println("Correos:")
        val correos = listaDeCadenas.flatMap(cadena => encontrarCorreos(cadena))
        correos.foreach(correo => println("- " + correo))

        // Test números de celular
        println("\nNúmeros de celular:")
        val numerosCelular = listaDeCadenas.flatMap(cadena => encontrarNumerosCelular(cadena))
        numerosCelular.foreach(numero => println("- " + numero))

        // Test direcciones
        println("\nDirecciones:")
        val direcciones = listaDeCadenas.flatMap(cadena => encontrarDirecciones(cadena))
        direcciones.foreach(direccion => println("- " + direccion))

    }

}