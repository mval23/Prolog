# Prolog

## Características generales
- Lenguaje declarativo basado en reglas lógicas.
- Programación basada en relaciones y hechos.

## Átomos, hechos, cláusulas, objetivos, variables, predicados, literales
- Átomo: Un símbolo o constante (por ejemplo, 'hola', 42).
- Hecho: Declaración de una relación (por ejemplo, 'es_mamífero(león)').
- Cláusula: Puede ser un hecho o una regla.
- Objetivo: Consulta o meta que se busca demostrar.
- Variable: Empieza con mayúscula (por ejemplo, 'X').
- Predicado: Relación o propiedad (por ejemplo, 'es_mamífero').
- Literal: Predicado o negación de un predicado.

```prolog
% Ejemplo de hechos y predicados
es_mamífero(león).
es_mamífero(gato).

% Ejemplo de objetivo
?- es_mamífero(león). % Verdadero si 'león' es mamífero.
```

## Reglas de producción, bases de hechos y consultas
- Reglas: Definen cómo se relacionan los hechos.
- Bases de hechos: Conjunto de hechos.
- Consultas: Preguntas que se hacen al sistema.

```prolog
% Ejemplo de regla
es_felino(X) :- es_mamífero(X).

% Consulta
?- es_felino(gato). % Verdadero si 'gato' es un felino.
```

## Bases de reglas, back-chaining y backtracking
- Bases de reglas: Conjunto de reglas.
- Back-chaining: Proceso de buscar reglas para demostrar un objetivo.
- Backtracking: Reversión de decisiones en caso de fallo.

## Variables anónimas, unificación y cut
- Variables anónimas: Representadas por '_', no se utilizan más tarde.
- Unificación: Coincidencia de valores en variables.
- Cut ('!'): Evita el backtracking en un punto específico.

```prolog
% Ejemplo de cut
mayor(X, Y, X) :- X >= Y, !.
mayor(_, Y, Y).
```

## Recursividad y tail-recursion
- Prolog admite recursión.
- La tail-recursión es una forma eficiente de recursión.

```prolog
% Ejemplo de recursividad
factorial(0, 1).
factorial(N, Resultado) :- N > 0, N1 is N - 1, factorial(N1, Resultado1), Resultado is N * Resultado1.
```

## Listas, verificación de restricciones
- Listas: Estructuras de datos homogéneas.
- Verificación de restricciones: Validación de propiedades de las listas.

```prolog
% Ejemplo de lista y verificación de restricciones
miembro(X, [X|_]).
miembro(X, [_|T]) :- miembro(X, T).

% Consulta
?- miembro(3, [1, 2, 3, 4]). % Verdadero si 3 es miembro de la lista.
```

