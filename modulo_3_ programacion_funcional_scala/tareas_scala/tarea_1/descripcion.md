# Descripción Tarea 1

## Clase Persona
La clase `Persona` tiene los siguientes atributos:
- `nombre` (String): El nombre de la persona.
- `edad` (Int): La edad de la persona.
- `cedula` (Int): El número de cédula de la persona.
- `peso` (Double): El peso de la persona.
- `altura` (Double): La altura de la persona.

Además, la clase `Persona` contiene los siguientes métodos:
- `calcularIMC()`: Calcula si la persona está en su peso ideal utilizando la fórmula `peso / (altura^2)`. Retorna el resultado como un String que indica si la persona está bajo de peso, tiene un peso normal, sobrepeso u obesidad.
- `esMayorDeEdad()`: Retorna un valor booleano (`true` o `false`) dependiendo de si la persona es mayor de edad. Será `true` si la persona tiene 18 años o más.
- `presentacion()`: Retorna un String que contiene una presentación de la persona en el formato "Hola!, mi nombre es (nombre) con cédula (cedula) y tengo (edad) años."

## Clase Trabajador
La clase `Trabajador` hereda de la clase `Persona` y, además de los atributos de la clase `Persona`, tiene un atributo adicional:
- `profesion` (String): La profesión del trabajador.

La clase `Trabajador` incluye el siguiente método adicional:
- `infoTrabajo()`: Retorna un String que contiene la profesión del trabajador.

Este diseño permite crear objetos de tipo `Persona` y `Trabajador`, donde un `Trabajador` es una extensión de una `Persona` con la adición de información relacionada con su profesión.