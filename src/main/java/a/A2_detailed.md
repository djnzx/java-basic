# Java Basic - Detailed Syllabus

## Lesson 1

- intro
- software install:
  - [JDK 8+](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or [JDK13](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html)
  - [GIT](https://git-scm.com/downloads)
  - [Intellij Idea](https://www.jetbrains.com/idea/download)
- git idea / architecture: stage / local / remote / .gitignore
- repositories description
  - [maven template for homework](https://github.com/alexr007/java-hw-template.git) should be cloned to your account
  - [maven template for any project](https://github.com/alexr007/java-maven-template.git) should be cloned to your account
- git commands: add / commit / push / clone / fetch / pull
- creating OWN repositories in GitHub
- JVM / JRE / JDK
- application lifecycle: writing, compiling (to bytecode), running
- application structure:
  - [sequential order](./code/AnyApplicationStructure.java)
  - input-process-output
- application entry point (public static void main(String... args))
- IntellijIDEA
  - [shortcuts](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
  - preferences
  - project settings
- [first application "Hello World"](./code/HelloWorldApp.java)
- [simple code example](./code/BasicCode.java)

## Lesson 2

- variables [declaration](./code/variables/VariableDeclarationApp.java)
  - final
  - mutable / immutable
- data types
  - static vs dynamic typing
  - int's, float's, char, bool, string...
  - binary overflow
  - float precision
  - sizes: 1 bit / 1 byte / 2 bytes / 4 bytes
  - [char as int and int as char](./code/variables/CharAsIntApp.java)
  - [ASCII table](http://www.asciitable.com/index/asciifull.gif)
  - type size [widening / narrowing](./code/variables/DataTypesNarrowWideApp.java)
  - [size/sign conversion](./code/variables/VariablesConvertApp.java)
  - casting
  - minimal and maximal values
  - primitives vs referential
  - default values
- [random values generation](./code/randoms/RandomApp.java)
  - [stream of randoms](./code/randoms/RandomStreamApp.java)
  - random string [1](./code/randoms/RandomStringApp1.java), [2](./code/randoms/RandomStringApp2.java)
- System.in / System.out / println / Scanner
  - [printf detailed explanation](https://www.baeldung.com/java-printstream-printf)
- [command line argument list](./code/ArgumentsListApp.java)
- abstraction
- code flow
- control structures
  - branching: [if-else / switch-case-default](./code/syntax/ControlStructIfSwitch.java)
  - logical operations: !, &&, ||
  - iterating: for / while / do-while / break /
  - [continue](./code/syntax/WhileContinueApp.java)
  - [operator arity: unary / binary / ternary](./code/syntax/ArityApp.java)
  - ternary operator

## Lesson 3

- Java memory model: garbage collector
- arrays
  - declaration
  - [comprehension](./code/array/ArraysComprehensionApp.java)
  - [passing, returning arrays, anonymous array](./code/array/ArraysExtraApp.java)
  - copying
  - filtering
  - shifting
  - [multidimensional arrays](./code/array/ArraysMultidimensional.java)
- string
  - [String](./code/strings/StringsApp.java)
  - [string operations](./code/strings/StringOps.java)
  - alphabet creation [1](./code/strings/AlphabetApp1.java), [2](./code/strings/AlphabetApp2.java)
  - StringBuilder
  - StringJoiner, String.join
  - pitfalls
    - [concatenations via +](./code/strings/AppleTroubleApp.java) 
- code structure:
  - blocks / functions
  - [scope of visibility](./code/syntax/Scope.java)
  - methods / classes / packages
  - [overload, varargs #1](./code/syntax/VarArgsApp.java)
  - [overload, varargs #2](./code/syntax/FunctionApp.java)
  - varargs resolution precedence
- code-style (naming conventions, formatting, spaces, brackets)
- task decomposition / complexity breakdown

## Lesson 4

- Java memory model:
  - stack / heap
  - [pass by value](./code/jmm/PassingByValues.java)
  - [pass by reference object](./code/jmm/PassingByReference1.java)
  - [pass by reference array](./code/jmm/PassingByReference2.java)
  - primitive types (int, boolean, char, ...) vs reference types (object and array)
- [enums](./code/enums)
  - [declaration #1](./code/enums/Day.java)
  - [declaration #2](./code/enums/DeliveryType.java)
  - [declaration #3](./code/enums/OrderStatus.java)
  - [use cases](./code/enums/EnumsApp.java)
  - [cool example from StackOverflow](https://stackoverflow.com/questions/52569365/how-to-type-a-string-using-chars/52606773#52606773)
- code readability / clean code
- meaningful variables naming
  - [linkedin post](https://www.linkedin.com/feed/update/urn:li:activity:6633970713369817088/)

## Lesson 5

- Java memory model:
  - class loader / stack / heap
  - [static variables](./code/jmm/StaticApp.java)
  - [static methods](./code/jmm/AlgorithmApp.java)
  - [String in the heap and in the string pool](./code/strings/StringLocationApp.java)
  - [null with static trick](./code/jmm/TrickySyntaxApp.java) 
- class / object / instance
- type wrappers (Int, Long, ...)
  - [syntax](./code/generics/TypeWrappers.java)
  - [boxing, unboxing](./code/generics/TypeWrappersBoxUnbox.java)
  - [why do we need them](./code/generics/TypeWrappersWhy.java)
- [generics basics](./code/generics/GenericsApp.java)
- collection intro

## soft skills

- own [GitHub profile](https://github.com/alexr007) (you should have a place to store your code and be able to show it)
- own [StackOverflow Profile](https://stackoverflow.com/users/6896067/alexey-rykhalskiy) (learn how to search, how to ask, how to answer, be succinct, aptly and concise)
- question asking (don't be shy to ask a question)
- comments vs TODO
- comments vs meaningful names for variables, functions, parameters, methods, classes, files, folders, etc.
- code / meta-code / pseudo-code / block-schemes

### tasks
- [how old are you]()
- envelope [DESC]() [1](./tasks/envelope/EnvelopeApp1.java), [2](./tasks/envelope/EnvelopeApp2.java), [3](./tasks/envelope/EnvelopeApp3.java), [4](./tasks/envelope/EnvelopeApp4.java), [5](./tasks/envelope/EnvelopeApp5.java)  
- arrays
  - fill with randoms [DESC]() [1](./tasks/arrays/ArrayFillRandoms1.java), [2](./tasks/arrays/ArrayFillRandoms2.java)
  - filter by predicate [DESC]() [1](./tasks/arrays/ArrayFilter1.java), [2](./tasks/arrays/ArrayFilter2.java), [3](./tasks/arrays/ArrayFilter3.java), [4](./tasks/arrays/ArrayFilter4.java)
  - copy array [DESC]() [1](./tasks/arrays/ArrayCopy1.java), [2](./tasks/arrays/ArrayCopy2.java), [3](./tasks/arrays/ArrayCopy3.java), [4](./tasks/arrays/ArrayCopy4PartOf.java)
  - join/merge arrays [DESC]() [1](./tasks/arrays/ArrayMerge1.java), [2](./tasks/arrays/ArrayMerge2.java), [3](./tasks/arrays/ArrayMergeMix3.java)
  - rotation [DESC]() [1](./tasks/arrays/ArrayRotate1.java), [2](./tasks/arrays/ArrayRotate2.java), [3](./tasks/arrays/ArrayRotate3.java)
  - fill with the given order [DESC]() [1](./tasks/arrays/ArrayFillWith1.java), [2](./tasks/arrays/ArrayFillWith2.java), [3](./tasks/arrays/ArrayFillWith3.java)
- strings
  - generate random string [DESC](./tasks/strings/RandomString.txt) [1](./tasks/strings/RandomStringApp.java)
  - strings are the same [DESC]() [1](./tasks/strings/StringsAreTheSame.java)
  - revert [DESC]() [1](./tasks/strings/RevertStringApp1.java), [2](./tasks/strings/RevertStringApp2.java)
  - are strings rotated? [DESC]() [1](./tasks/strings/AreStringsRotated.java)
  - is palindrome? [DESC]() [1](./tasks/strings/IsStringPalindrome.java)
