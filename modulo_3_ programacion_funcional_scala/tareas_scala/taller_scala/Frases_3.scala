object Frases_3 {
    def palabraMasLarga(frases: List[String]): String = {
        // Se divide cada frase en palabras
        val palabras = frases.flatMap(frase => frase.split("\\s+"))
        // Se obtiene la palabra más larga
        val palabraMasLarga = palabras.reduceLeft((palabra1, palabra2) => if (palabra1.length > palabra2.length) palabra1 else palabra2)
        palabraMasLarga
    }

    def main(args: Array[String]): Unit = {
        // Test tarea 1
        val frases = List(
            "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work.",
            "And the only way to do great work is to love what you do.",
            "If you haven't found it yet, keep looking. Don't settle.",
            "As with all matters of the heart, you'll know when you find it.",
            "Your time is limited, so don't waste it living someone else's life.",
            "Don't let the noise of others' opinions drown out your own inner voice.",
            "And most important, have the courage to follow your heart and intuition.",
            "Stay hungry, stay foolish.",
            "I want to put a ding in the universe.",
            "Remembering that you are going to die is the best way I know to avoid the trap of thinking you have something to lose.",
            "You are already naked. There is no reason not to follow your heart."
        )
        val palabra = palabraMasLarga(frases)
        println(s"La palabra más larga es: $palabra") // Utilizo el nuevo nombre
    }
}