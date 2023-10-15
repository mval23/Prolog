# Scala cheatsheet

## Lists

Lists in Scala are one of the fundamental data structures for storing a sequence of elements. They are implemented as a singly-linked list, which is a recursive data structure. Here's a cheat sheet to help you understand how lists work in Scala:

### Creating Lists
```scala
// Creating an empty list
val emptyList = List()

// Creating a list with elements
val numbers = List(1, 2, 3, 4, 5)

// Using the :: operator (cons) to build a list
val myList = 1 :: 2 :: 3 :: Nil
```

### Basic Operations
```scala
// Accessing the head (first element) of the list
val firstElement = myList.head

// Accessing the tail (all elements except the first) of the list
val restOfList = myList.tail

// Concatenating two lists
val combinedList = myList ::: numbers
```

### List Methods
```scala
// Adding an element to the beginning of the list
val newList = 0 +: myList

// Appending an element to the end of the list
val appendedList = myList :+ 4

// Checking if the list is empty
val isEmpty = myList.isEmpty

// Finding the length of the list
val listLength = myList.length

// Reversing a list
val reversedList = myList.reverse
```

### List Comprehension
```scala
// Using for-comprehensions to create a new list
val squaredList = for (num <- numbers) yield num * num
```

### Pattern Matching
```scala
// Using pattern matching to destructure a list
myList match {
  case head :: tail => // Do something with head and tail
  case Nil => // Handle an empty list
}
```

### Higher-Order Functions
```scala
// Using higher-order functions like map, filter, and reduce
val doubled = numbers.map(x => x * 2)
val evens = numbers.filter(x => x % 2 == 0)
val sum = numbers.reduce((x, y) => x + y)
```

### Immutable
Lists in Scala are immutable. Any operation that appears to modify a list actually creates a new list with the changes.


Strings in Scala are similar to strings in many other programming languages, but they have some unique features due to Scala's strong type system and support for Unicode. Here's a cheat sheet to help you understand how strings work in Scala:

## Strings
```scala
// Creating a string using double quotes
val str1 = "Hello, World!"

// Creating a string using triple quotes (for multi-line strings)
val str2 = """This is a
multi-line
string."""

// Using String interpolation
val name = "Alice"
val greeting = s"Hello, $name!"
```

### String Concatenation
```scala
// Concatenating strings using the + operator
val fullName = "John" + " " + "Doe"

// Using the concat method
val combined = "Hello".concat("World")
```

### String Length
```scala
// Getting the length of a string
val length = str1.length
```

### String Indexing
```scala
// Accessing individual characters by index
val firstChar = str1(0) // H
val lastChar = str1(str1.length - 1) // !
```

### String Methods
```scala
// Converting to lowercase and uppercase
val lower = str1.toLowerCase
val upper = str1.toUpperCase

// Checking if a string starts or ends with a substring
val startsWithHello = str1.startsWith("Hello")
val endsWithWorld = str1.endsWith("World!")

// Finding the index of a substring
val indexOfComma = str1.indexOf(",")

// Replacing substrings
val replaced = str1.replace("Hello", "Hi")

// Splitting a string into an array
val words = str2.split(" ")
```

### String Interpolation
```scala
// Using s-interpolation for variable substitution
val age = 30
val message = s"My age is $age"

// Using f-interpolation for formatted strings
val pi = 3.14159
val formatted = f"The value of pi is $pi%.2f"
```

### Escaping Characters
```scala
// Escaping special characters
val specialChars = "This is a newline: \nAnd this is a tab: \t"

// Using raw-interpolation to avoid escaping
val rawStr = raw"This is a raw string \n"
```

### Unicode Support
Scala strings fully support Unicode characters, making it easy to work with various languages and special characters.

### Immutable
Strings in Scala are immutable, meaning any operation that appears to modify a string actually creates a new string with the changes.


