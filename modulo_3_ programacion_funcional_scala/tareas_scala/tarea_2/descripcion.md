# Ejercicios de Programación Funcional en Scala


## Ejercicio 1: Transformación de Caracteres

Utilizando la función `map`, se crea una nueva lista que convierte cada caracter de la lista original en una lista que contiene su versión en mayúscula y en minúscula.

**Ejemplo:**

```scala
Input: List('a', 'B', 'c')
Output: List(List('A', 'a'), List('B', 'b'), List('C', 'c'))
```

## Ejercicio 2: Filtrado de Nombres

Utilizando la función `filter`, se elimina de una lista de nombres aquellos que tengan menos de 6 letras o que no inicien con la letra "A".

**Ejemplo:**

```scala
Input: List("Andres David", "Camilo", "Juan")
Output: List("Andres David")
```

## Ejercicio 3: Identificación de Vocales

Dada una lista que contiene caracteres, se utiliza la función `foreach` para imprimir "true" si el carácter corresponde a una vocal.

**Ejemplo:**

```scala
Input: List("a", "b", "e", "f")
Output:
true (para 'a')
true (para 'e')
```

## Ejercicio 4: Procesamiento Recursivo

A partir de una lista que contiene números enteros, se realiza un proceso recursivo: si un elemento es impar, se multiplica por 2; de lo contrario, se mantiene igual. Luego, se reorganiza la lista de manera descendente sin repeticiones.

**Ejemplo:**

```scala
Input: List(1, 2, 3, 4, 5, 6, 7)
Output: List(14, 10, 6, 4, 2)
```

