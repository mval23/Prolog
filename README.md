# Prolog Cheat Sheet

## Variables
- Variables in Prolog start with uppercase letters or an underscore.
- Example: `X`, `_Variable`

## Facts
- Declaration of facts that establish relationships between objects.
- Example: `father(john, mary).`

## Rules
- Definition of rules that establish conditions and conclusions.
- Example:
  ```prolog
  brother(X, Y) :- father(Z, X), father(Z, Y).
  ```

## Queries
- Perform queries to obtain answers from the knowledge base.
- Example: `?- father(john, mary).`

## Lists
- Prolog has lists to handle sets of elements.
- Example: `[1, 2, 3]`, `[X, Y, Z]`

## Recursion
- Use recursion to solve problems iteratively.
- Example:
  ```prolog
  factorial(0, 1).
  factorial(N, Result) :- N > 0, N1 is N - 1, factorial(N1, R1), Result is N * R1.
  ```

## Cut (`!`)
- The cut operator is used to prevent Prolog from searching for more solutions.
- It can be used to optimize queries.
- Example:
  ```prolog
  max(X, Y, X) :- X >= Y, !.
  max(_, Y, Y).
  ```

## Backtracking
- Prolog's default behavior includes backtracking to find alternative solutions.

## Compatibility Lists
- You can use compatibility lists to check for membership of an element in a list.
- Example:
  ```prolog
  member(X, [X | _]).
  member(X, [_ | T]) :- member(X, T).
  ```

## Operators
- `is` is used for arithmetic evaluations.
- `=`, `==`, `=\=` for equality and inequality.
- `>`, `<`, `>=`, `<=` for numeric comparisons.
- `,` for the logical "and" operator.
- `;` for the logical "or" operator.

## Cut
- The cut operator (`!`) is used to prevent backtracking and reduce the search for solutions.

## Input/Output
- `write/1` for printing.
- `read/1` for reading user input.

## Comments
- Single-line comments start with `%`.
- Example: `% This is a comment.`


