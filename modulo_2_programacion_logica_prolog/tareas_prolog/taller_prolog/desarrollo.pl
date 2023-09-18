% 1. Crear una rutina recursiva en Prolog que permita invertir un número dado
% Ejemplo: 123456789 -> 987654321

%Un solo digito -> devuelve el mismo numero (caso base)
invertir(N, N) :-
    N < 10.

invertir(N, R) :-
    N >= 10,
    Ultimo is N mod 10,
    N1 is N // 10,
    invertir(N1, R1),
    atom_concat(Ultimo, R1, R). %Es una funcion que encontre para concatenar, se ve mas lindo
  	%R = R1 + Ultimo esta es la otra opcion usando lo aprendido en clase


2. Implementar el ejercicio anterior utilizando recursión de cola (Tail Recursion)