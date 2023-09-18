/* son del Signo los nacidos entre el DiaIni/MesIni y el DiaFin/MesFin */
horoscopo(aries,21,3,21,4).
horoscopo(tauro,21,4,21,5).
horoscopo(geminis,21,5,21,6).
horoscopo(cancer,21,6,21,7).
horoscopo(leo,21,7,21,8).
horoscopo(virgo,21,8,21,9).
horoscopo(libra,21,9,21,10).
horoscopo(escorpio,21,10,21,11).
horoscopo(sagitario,21,11,21,12).
horoscopo(capricornio,21,12,21,1).
horoscopo(acuario,21,1,21,2).
horoscopo(piscis,21,2,21,3).
mes(1,31).
mes(2,28).
mes(3,31).
mes(4,30).
mes(5,31).
mes(6,30).
mes(7,31).
mes(8,31).
mes(9,30).
mes(10,31).
mes(11,30).
mes(12,31).
/* signo(Dia,Mes,Signo) <- los nacidos el Dia/Mes pertenecen al signo Signo */
%Aca va su codigo para el horoscopo

signo(Dia, Mes, Signo) :-
    mes(Mes, DiaMax),
    Dia =< DiaMax,
 	1 =< Mes, Mes =< 12,
    M1 is Mes - 1,
    Dia < 21,
    horoscopo(Signo,21,M1,21,Mes).

signo(Dia, Mes, Signo) :-
    mes(Mes, DiaMax),
    Dia =< DiaMax,
 	1 =< Mes, Mes =< 12,
    M2 is Mes + 1,
    Dia >= 21,
    horoscopo(Signo,21,Mes,21,M2).

signo(Dia, Mes, Signo) :-
    mes(Mes, DiaMax),
    DiaMax =< Dia,
    Signo = "Dia invalido del mes" + Mes, !.


signo(_, Mes, Signo) :-
   	Mes > 12,
    Signo = "Mes Invalido", !.

signo(_, Mes, Signo) :-
   	Mes < 0,
    Signo = "Mes Invalido", !.


%Aca va su codigo para el factorial
factorial(0, 1).
factorial(A,B) :-
    A1 is A - 1,
    factorial(A1, B1),
    B is A * B1,
    A > 0.

%Aca va su codigo de triangular recursivo\
triang(1, 1).
triang(A,B) :-
    A1 is A - 1,
    triang(A1, B1),
    B is B1 + A,
    A > 1.

%Aca va su codigo de triangular con tail recursion
triangular(1, 1).
triangular(N, Result) :-
    triangular2(N, 1, 0, Result).

triangular2(1, N, Acc, Result) :-
    Result is N + Acc.
triangular2(N, N, Acc, Result) :-
    Result is N + Acc.
triangular2(N, Current, Acc, Result) :-
    NextCurrent is Current + 1,
    NextAcc is Acc + Current,
    triangular2(N, NextCurrent, NextAcc, Result).




% NO BORRAR
isEqual(A,B):- A==B.
ope(N,E,R):- isEqual(N,1),signo(24,E,R).
ope(N,E,R):- isEqual(N,2),signo(31,E,R).
ope(N,E,R):- isEqual(N,3),signo(1,E,R).
ope(N,E,R):- isEqual(N,4),signo(8,E,R).
ope(N,E,R):- isEqual(N,5),factorial(E,R).
ope(N,E,R):- isEqual(N,6),factorial(E,R).
ope(N,E,R):- isEqual(N,7),factorial(E,R).
ope(N,E,R):- isEqual(N,8),factorial(E,R).
ope(N,E,R):- isEqual(N,9),triang(E,R).
ope(N,E,R):- isEqual(N,10),triang(E,R).
ope(N,E,R):- isEqual(N,11),triangular(E,R).
ope(N,E,R):- isEqual(N,12),triangular(E,R).


main:-
    read(N),read(E),ope(N,E,R), write(R), halt.
:-main.