object MaximoComunDivisor_2 {
    def algoritmoEuclides(a: Int, b: Int): Int = {
        // Si b es 0, entonces el MCD es a (caso base)
        // Si b no es 0, entonces el MCD es el MCD de b y el residuo de a/b
        if (b == 0) a else algoritmoEuclides(b, a % b)
    }

    def main(args: Array[String]): Unit = {
        val num1 = 120
        val num2 = 36
        val mcd = algoritmoEuclides(num1, num2)
        println(s"\nEl Máximo Común Divisor de $num1 y $num2 es $mcd")
    }
}