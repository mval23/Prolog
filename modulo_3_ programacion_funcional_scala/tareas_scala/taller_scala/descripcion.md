# Taller Scala 


## Descripción de las Tareas

1. Utilizando programación funcional desarrollar un sistema que permita:

   * Utilizar una estructura de datos que permita representar una lista de productos para una empresa X.
   * Un producto se compone de: nombre, cantidad en stock, SKU, categoría (ropa, electrodomésticos, mascotas) y precio.
   * Segmentar las listas por categoría.
   * Generar una lista que permita simular un carrito de compras.
   * En el carrito de compras encontrar el producto más costoso, relacionando precio y cantidad.
   * Encontrar el total de la cuenta.
   * Organizar la lista por cantidades (mayor a menor) de manera recursiva.
   * Organizar la lista por cantidades (menor a mayor) utilizando métodos funcionales.
   * Imprimir utilizando interpolación el siguiente mensaje por producto:
     "Se han comprado n productos a un valor unitario p, para un total de: t"
   * A los productos de categoría mascotas se le aplicará un descuento del 20% todos los martes, crear una función que liste para el día actual cuales productos tienen dicho descuento en el carrito de compras.

2. Encontrar el máximo común divisor (MCD) de dos números utilizando el algoritmo de Euclides de manera recursiva.

3. Utilizando `reduceLeft`, encontrar la palabra más larga en una lista de frases.

4. Realizar una función de orden superior llamada `minDistancia` que calcule la distancia mínima entre una lista de puntos. Como primer parámetro tendrá una lista de tuplas (X, Y), que representarán las coordenadas, y como segundo parámetro recibirá una función que calcule la distancia entre 2 puntos.

5. A partir de una lista que contiene distintos Strings, cree expresiones regulares que permitan segmentar correctamente:

    * Correo electrónico: Conformado por nombre de usuario (permite caracteres alfanuméricos y el .) y un dominio (los dominios válidos para este problema serán gmail.com, unal.edu.co y med.gov.co), recordar que el nombre y el dominio estarán separados por @.
    * Numero celular: tiene el formato XXX*XXX*YY*YY, donde las X representan números del 0 al 7 y las Y números del 3 al 5.
    * Dirección: Para este ejercicio solo consideraremos calles y carreras, teniendo así el formato (Cra/Cll) XX # XX*X, donde las X representan números del 0 al 9.

