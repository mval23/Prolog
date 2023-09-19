# Taller Prolog 10%

1. Crear una rutina recursiva en Prolog que permita invertir un número dado
    Ejemplo: 123456789 -> 987654321

```prolog
%Un solo digito -> devuelve el mismo numero 
invertir(N, N) :- 
    N < 10.

invertir(N, R) :-
    N >= 10,
    Ultimo is N mod 10,
    N1 is N // 10,
    invertir(N1, R1),
    atom_concat(Ultimo, R1, R). 
    %Es una funcion que encontre para concatenar
    %Visualmente es mas amigable
    %Esta es la otra opcion usando lo aprendido en clase
    %R = R1 + Ultimo
```  

2. Implementar el ejercicio anterior utilizando recursión de cola (Tail Recursion)

```prolog
%Un solo digito -> devuelve el mismo numero 
invertirTr(N, A, R) :- 
    N < 10,
    atom_concat(A, N, R).
    %R = N + A.

invertirTr(N, A, R) :-
    N >= 10,
    Ultimo is N mod 10,
    N1 is N // 10,
    atom_concat(A, Ultimo, A1),
    %A1 = Ultimo + A,
    invertirTr(N1, A1, R).

invertir(N, R):-
    invertirTr(N, "", R).
```  


3. Código recursivo que quita todas las ocurrencias de un elemento en una lista.
Ejemplo 1: quitar(2, [3,5,8,6,2,3,2,3,2], N) el resultado es N = [3,5,8,6,3,3]. \
Ejemplo 2: quitar(g, [d,a,d,g,g,s,d,f], N) el resultado es N = [d,a,d,s,d,f] 

```prolog
% (Caso base) Lista vacia
quitar(_, [], []):- !.

% N es la cabeza
quitar(N, [N | T], R) :-
    quitar(N, T, R), !.

% N no es la cabeza
quitar(N, [H | T], [H | R]) :-
    N \= H,
    quitar(N, T, R), !.
```

4. Encuentra la representación recursiva de cola (Tail recursion) para los siguientes casos: \
   a. fibonacci(X,Y), Y es el X-simo número de Fibonacci.

```prolog

```
    
b. producto(X,Y,Z), Z es el producto de X por Y. 

5. 
