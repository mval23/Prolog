# Prolog Cheat Sheet

##  Overview, Programming Paradigms, Classification, Introduction to Declarative and Functional Languages

### Programming Paradigms:
Programming paradigms refer to the different styles or approaches to writing computer programs. Here are five main ideas about programming paradigms:

- **Imperative Paradigm**: 
    Programs are written as sequences of statements that change a program's state. Examples include C, C++, and Java.

- **Declarative Paradigm**: Programs focus on expressing what should be accomplished rather than how to achieve it. Includes languages like SQL and Prolog.

- **Functional Paradigm**: Emphasizes the use of functions and immutable data. Prominent languages include Haskell and Lisp.

- **Object-Oriented Paradigm**: Organizes code around objects and their interactions. Widely used in languages like Python, Java, and C++.

- **Logical Paradigm**: Logic programming languages like Prolog use a set of facts and rules to deduce new facts. They are particularly suitable for AI and expert systems.

### Classification:
Classification in the context of programming languages involves categorizing them based on their characteristics. Here are five key points about language classification:

- **High-Level vs. Low-Level Languages**: High-level languages are more abstract and easier to read/write, while low-level languages are closer to machine code.

- **Compiled vs. Interpreted Languages**: Some languages are compiled into machine code before execution (e.g., C++), while others are interpreted line by line at runtime (e.g., Python).

- **Procedural vs. Object-Oriented vs. Functional**: Languages can be classified based on their dominant paradigm (e.g., C is procedural, Java is object-oriented, Haskell is functional).

- **Static vs. Dynamic Typing**: Static typing requires variable types to be declared at compile-time (e.g., C++), while dynamic typing determines types at runtime (e.g., Python).

- **General-Purpose vs. Domain-Specific**: General-purpose languages can be used for various applications, while domain-specific languages are designed for specific tasks (e.g., SQL for databases).

### Compilation vs. Interpretation:
Compilation and interpretation are two different approaches to executing code. Here are five main ideas about compilation vs. interpretation:

- **Compilation**:
  - Code is translated into machine code or an intermediate representation.
  - The resulting code is typically stored in a separate file (executable).
  - Execution is generally faster because the code is pre-converted.
  - Examples include C, C++, and Rust.
  - Requires a separate compilation step before running the program.

- **Interpretation**:
  - Code is executed line by line without prior translation.
  - No separate executable file is generated.
  - Execution can be slower because of the interpretation step.
  - Examples include Python, JavaScript, and Ruby.
  - Changes to the code often don't require recompilation; they take effect immediately.

Certainly, I'll explain the principles of syntax and semantics, lexical analysis, syntax analysis, BNF (Backus-Naur Form), and context-free grammars in a detailed and organized manner using markdown:

### Principles of Syntax and Semantics:
Syntax and semantics are fundamental concepts in programming languages. Here are five main ideas about them:

- **Syntax**:
  - Syntax refers to the rules governing the structure and composition of statements in a programming language.
  - It defines how symbols and keywords should be arranged to form valid expressions, commands, or programs.
  - Syntax errors occur when code violates these rules, making it impossible to parse or compile.

- **Semantics**:
  - Semantics deals with the meaning of program statements.
  - It defines what specific operations or actions the code should perform when executed.
  - Syntax governs how code looks, while semantics governs what it does.

- **Syntactic vs. Semantic Errors**:
  - Syntactic errors are related to violations of language grammar (e.g., missing a closing parenthesis).
  - Semantic errors occur when code does not behave as intended (e.g., using a variable before it's initialized).

- **Ambiguity**:
  - Ambiguity in syntax means that a single sequence of symbols can be interpreted in multiple ways.
  - Resolving ambiguity is essential for creating a clear and unambiguous language specification.

- **Formal Methods**:
  - Formal methods provide a mathematical framework for specifying both syntax and semantics precisely.
  - They are used to create formal language definitions, ensuring consistency and correctness.

### Lexical Analysis:
Lexical analysis is the first phase of compiling a program. Here are five main ideas about lexical analysis:

- **Tokenization**:
  - Lexical analysis breaks the source code into tokens, which are meaningful units such as keywords, identifiers, and literals.
  - Tokens are the basic building blocks for the subsequent phases of compilation.

- **Regular Expressions**:
  - Regular expressions are often used to define the lexical rules of a programming language.
  - They describe patterns that correspond to different types of tokens.

- **Lexical Errors**:
  - Lexical analysis detects and reports errors like misspelled keywords or unrecognized characters.
  - Error recovery strategies may involve skipping or replacing problematic tokens.

- **Whitespace and Comments**:
  - Lexical analysis identifies and handles whitespace and comments, which are generally ignored by the compiler.
  - Comments provide human-readable explanations within the code.

- **Symbol Tables**:
  - During lexical analysis, a symbol table may be created to keep track of identifiers and their attributes for later phases of compilation.

### Syntax Analysis:
Syntax analysis, also known as parsing, is the second phase of compilation. Here are five main ideas about syntax analysis:

- **Grammar**:
  - Syntax analysis uses a formal grammar to define the language's syntactic rules.
  - Context-free grammars (CFGs) are commonly used for this purpose.

- **BNF (Backus-Naur Form)**:
  - BNF is a notation used to formally describe the syntax of a programming language.
  - It consists of production rules that define how valid sentences (programs) are constructed.

- **Parsing**:
  - Parsing is the process of analyzing the source code according to the grammar rules.
  - It generates a parse tree or abstract syntax tree (AST) that represents the code's structure.

- **Syntax Errors**:
  - Syntax analysis identifies and reports syntax errors, such as missing or misplaced symbols.
  - Error recovery strategies may involve adding or removing symbols to continue parsing.

- **AST and Semantic Analysis**:
  - The parse tree or AST produced during syntax analysis is used in subsequent phases for semantic analysis and code generation.

