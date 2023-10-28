object SistemaCompras_1 {

    // Clase para representar un producto de stock
    class ProductoStock(val nombre: String, var cantidadStock: Int, val sku: String, val categoria: String, val precio: Double)

    // Clase para definir la lista de productos para una empresa
    class ProductosEmpresa(val productosStock: List[ProductoStock]) {
        def agregarProducto(producto: ProductoStock): ProductosEmpresa = {
            new ProductosEmpresa(producto :: productosStock)
        }

        def obtenerProductosPorCategoria(categoria: String): Unit = {
            val productosCategoria = this.productosStock.filter(_.categoria == categoria)
            println(s"Productos de la categoría: $categoria")
            productosCategoria.foreach(p => println("- " + p.nombre))
        }
    }

    case class Producto(nombre: String, cantidad: Int, sku: String, categoria: String, precio: Double)

    // Clase para representar un carrito de compras
    class CarritoCompras(var productos: List[Producto]) {
        // Método para agregar un producto al carrito
        def agregarProducto(productoS: ProductoStock, cantidad: Int): CarritoCompras = {
            // Se crea una nueva instancia de la clase Producto a partir de la clase ProductoStock
            productoS.cantidadStock = productoS.cantidadStock - cantidad // Se actualiza el stock del producto
            val producto = Producto(productoS.nombre, cantidad, productoS.sku, productoS.categoria, productoS.precio) // Se retorna una nueva instancia de la clase CarritoCompras con el producto agregado
            this.productos = producto :: productos
            this
        }

        // Método para encontrar el producto más costoso en el carrito
        def productoMasCostoso(): Producto = {
            productos.maxBy(p => p.precio * p.cantidad)
        }

        // Método para calcular el total de la cuenta en el carrito
        def calcularTotal(): Double = {
            productos.map(p => p.precio * p.cantidad).sum
        }

        // Método para organizar la lista por cantidades (mayor a menor)
        def organizarPorCantidadDescendente(productos: List[Producto]): List[Producto] = {
            if (productos.isEmpty) {
                Nil // Lista vacía, no hay nada que organizar
            } else {
                val max = productos.maxBy(_.cantidad) // Encuentra el producto con la mayor cantidad
                val restantes = productos.filterNot(_ == max) // Filtra los productos restantes
                max :: organizarPorCantidadDescendente(restantes) // Agrega el producto máximo y continúa la recursión
            }
        }

        // Método para organizar la lista por cantidades (menor a mayor)
        def organizarPorCantidadAscendente(): List[Producto] = {
            productos.sortBy(_.cantidad)
        }

        // Método para imprimir un mensaje por producto en el carrito
        def imprimirMensajePorProducto(): Unit = {
            productos.foreach(p => {
                val total = p.precio * p.cantidad
                println(s"Se han comprado ${p.cantidad} ${p.nombre} a un valor unitario ${p.precio}, para un total de: $total")
            })
        }

        // Función para listar productos con descuento en el día actual
        def listarProductosConDescuento(dia: String): List[Producto] = {
            if (dia.toLowerCase == "martes") { // 20% de descuento los martes
                productos.filter(p => p.categoria == "mascotas").map { producto =>
                    producto.copy(precio = producto.precio * 0.8)
                }
            } else {
                List.empty[Producto]
            }
        }


    }

    def main(args: Array[String]): Unit = {
        // Productos Stock de tipo ropa
        val productoStock1 = new ProductoStock("Camisa", 10, "123", "ropa", 10000)
        val productoStock2 = new ProductoStock("Pantalon", 5, "456", "ropa", 20000)
        val productoStock3 = new ProductoStock("Zapatos", 3, "789", "ropa", 30000)
        val productoStock4 = new ProductoStock("Corbata", 20, "101", "ropa", 5000)

        // Productos Stock de tipo mascotas
        val productoStock5 = new ProductoStock("Croquetas", 100, "102", "mascotas", 10000)
        val productoStock6 = new ProductoStock("Hueso de juguete", 50, "103", "mascotas", 20000)
        val productoStock7 = new ProductoStock("Cama para mascotas", 30, "104", "mascotas", 30000)
        val productoStock8 = new ProductoStock("Collar", 200, "105", "mascotas", 5000)

        // Productos Stock de tipo tecnologia
        val productoStock9 = new ProductoStock("Computador", 10, "106", "tecnologia", 1000000)
        val productoStock10 = new ProductoStock("Celular", 5, "107", "tecnologia", 2000000)
        val productoStock11 = new ProductoStock("Tablet", 3, "108", "tecnologia", 3000000)
        val productoStock12 = new ProductoStock("Audifonos", 20, "109", "tecnologia", 500000)

        // Test hacer lista de productos para una empresa
        val listaProductos = List(productoStock1, productoStock2, productoStock3, productoStock4, productoStock5, productoStock6, productoStock7, productoStock8, productoStock9, productoStock10, productoStock11, productoStock12)

        // Test para segmentar por categoría
        val productosEmpresa = new ProductosEmpresa(listaProductos)
        productosEmpresa.obtenerProductosPorCategoria("ropa")
        println(" ")
        productosEmpresa.obtenerProductosPorCategoria("mascotas")
        println(" ")
        productosEmpresa.obtenerProductosPorCategoria("tecnologia")
        println(" ")

        // Test simular Carrito de Compras
        val carrito = new CarritoCompras(List.empty[Producto])
        carrito.agregarProducto(productoStock1, 2)
        carrito.agregarProducto(productoStock2, 1)
        carrito.agregarProducto(productoStock3, 3)
        carrito.agregarProducto(productoStock4, 4)
        carrito.agregarProducto(productoStock5, 2)
        carrito.agregarProducto(productoStock6, 5)
        carrito.agregarProducto(productoStock7, 1)
        carrito.agregarProducto(productoStock8, 6)
        carrito.agregarProducto(productoStock9, 2)
        carrito.agregarProducto(productoStock10, 1)
        carrito.agregarProducto(productoStock11, 1)
        carrito.agregarProducto(productoStock12, 2)

        // Test para encontrar el producto más costoso
        val productoMasCostoso = carrito.productoMasCostoso()
        println(s"El producto más costoso es: ${productoMasCostoso.nombre} con un valor de: ${productoMasCostoso.precio}")
        println(" ")

        // Test para calcular el total de la cuenta
        val total = carrito.calcularTotal()
        println(s"El total de la cuenta es: $total")
        println(" ")

        // Test para organizar la lista por cantidades (mayor a menor)
        val productosOrganizados = carrito.organizarPorCantidadDescendente(carrito.productos)
        println("Productos organizados por cantidad (mayor a menor):")
        productosOrganizados.foreach(p => println(s"- ${p.nombre} con ${p.cantidad} unidades"))
        println(" ")

        // Test para organizar la lista por cantidades (menor a mayor)
        val productosOrganizados2 = carrito.organizarPorCantidadAscendente()
        println("Productos organizados por cantidad (menor a mayor):")
        productosOrganizados2.foreach(p => println(s"- ${p.nombre} con ${p.cantidad} unidades"))
        println(" ")

        // Test para imprimir un mensaje por producto en el carrito
        println("Mensajes por producto:")
        carrito.imprimirMensajePorProducto()
        println(" ")

        // Test para listar productos con descuento en el día martes
        val productosConDescuento = carrito.listarProductosConDescuento("martes")
        println("Productos con descuento el dia Martes:")
        productosConDescuento.foreach(p => println(s"- ${p.nombre} con un valor de: ${p.precio}"))
        println(" ")

        // Test para listar productos con descuento en el día jueves
        val productosConDescuento2 = carrito.listarProductosConDescuento("jueves")
        println("Productos con descuento el dia Jueves:")
        if (productosConDescuento2.isEmpty) {
            println("No hay productos con descuento el dia Jueves")
        } else {
            productosConDescuento2.foreach(p => println(s"- ${p.nombre} con un valor de: ${p.precio}"))
        }
    }
}
