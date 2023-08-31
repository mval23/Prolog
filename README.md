
# Prolog Cheatsheet

## Facts and Rules
Facts define relationships or properties.
Rules define conditions and conclusions.

### Defining Facts
```prolog
likes(john, pizza).
likes(mary, ice_cream).
```

### Defining Rules
```prolog
friend(X, Y) :- likes(X, Z), likes(Y, Z).
```

## Queries
Queries are used to ask questions to Prolog. Enter queries in the Prolog interpreter.

### Query Examples
- Query to find if John likes pizza:
  ```
  ?- likes(john, pizza).
  ```
- Query to find who likes ice cream:
  ```
  ?- likes(Who, ice_cream).
  ```
- Query to find friends:
  ```
  ?- friend(john, Who).
  ```

## Variables and Unification
Variables start with uppercase letters.

### Using Underscore (_) as a Wildcard
Used to ignore certain values.

### Variable Query Example
Query to find what Mary likes:
```
?- likes(mary, _).
```

## Lists
Lists are denoted by square brackets.

### Defining Lists
```prolog
fruits([apple, banana, orange]).
```

### List Query Example
Query to find if apple is in the list:
```
?- member(apple, [apple, banana, orange]).
```

## Recursion
Prolog uses recursion for repetition.

### Recursion Example
```prolog
factorial(0, 1).
factorial(N, Result) :-
    N > 0,
    N1 is N - 1,
    factorial(N1, Result1),
    Result is N * Result1.
```

## Cut (!)
Cuts the backtracking, committing to the choice.

### Cut Example
```prolog
maximum(X, Y, X) :- X >= Y, !.
maximum(_, Y, Y).
```

## Arithmetic
Arithmetic is done using "is" keyword.

### Arithmetic Examples
Query to calculate 3 + 5:
```
?- Sum is 3 + 5.
```
Query to calculate factorial using arithmetic:
```
?- N = 5, Fact is 1, for(I, 1, N), Fact is Fact * I.
```

## Cut in Arithmetic
Cut can be used in arithmetic calculations.

### Cut in Arithmetic Example
```prolog
fibonacci(0, 0) :- !.
fibonacci(1, 1) :- !.
fibonacci(N, Result) :-
    N1 is N - 1,
    N2 is N - 2,
    fibonacci(N1, Result1),
    fibonacci(N2, Result2),
    Result is Result1 + Result2.
```
Query to find fibonacci number at position 7:
```
?- fibonacci(7, Result).
```
```

Feel free to copy and paste the Markdown code above into your preferred Markdown editor for easy reference.