**Task 01_1:**

a) Create a file named `Aufgabe01_1.java` and enter the following Hello World program:

```java
public class Aufgabe01_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

b) Run the program. If the compiler reports errors, fix the source code until no error messages appear.

c) Try to produce at least 5 different error messages by changing the source code one after another, and write down each error message before undoing the change. Examples:
• Omitting a semicolon — `Syntax error, insert ";" to complete BlockStatements`
• Omitting a curly brace — `Syntax error on token ")", { expected after this token`
• Changing capitalization — `Syntax error, insert ";" to complete ClassBodyDeclarations`; `Public cannot be resolved to a type`
• Omitting the class name — `Syntax error on token "class", Identifier expected after this token`
• Changing the class name — `java.lang.Error: Unresolved compilation problem: at HelloWorld.main(HelloWorldBugs.java:3)`
• Other typos — `Helo World`; `vid cannot be resolved to a type`; `The method printl(String) is undefined for the type PrintStream`

---

## What I Learned

### Structure of a Minimal Java Program

A simple Java program consists of a **class** with a **`main` method** as the entry point:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

- `public class` — declares a publicly accessible class
- `public static void main(String[] args)` — the method the JVM calls when the program starts
- `System.out.println(...)` — prints text to the console and moves to the next line
- Every statement ends with a **semicolon** (`;`)

### Compiling and Running

Java programs are executed in two steps:

```bash
javac HelloWorld.java    # source code → bytecode (.class file)
java HelloWorld          # run the bytecode
```

`javac` checks syntax and types. `java` runs the compiled program.

### Filename and Class Name Must Match

A file containing `public class HelloWorld` must be named `HelloWorld.java`. Mismatches cause compilation errors.

### Java Is Case-Sensitive

`public` ≠ `Public`, `println` ≠ `printl`, `void` ≠ `vid`. Typos produce messages like *"cannot be resolved to a type"* or *"method is undefined"*.

### Reading Compiler Error Messages

By intentionally causing errors (task c), I learned to use error messages as clues:

| Code Change | Typical Error Message |
|-------------|----------------------|
| Missing semicolon | `Syntax error, insert ";" to complete BlockStatements` |
| Missing curly brace | `Syntax error on token ")", { expected after this token` |
| Wrong capitalization (`Public`) | `Public cannot be resolved to a type` |
| Missing class name after `class` | `Syntax error on token "class", Identifier expected after this token` |
| Class name ≠ filename | `class X is public, should be declared in a file named X.java` |
| Typo in method (`printl`) | `The method printl(String) is undefined for the type PrintStream` |

Important: the line number in the message shows where the error is — look there first.

### Comments

Code in `/* ... */` (block comment) or `// ...` (line comment) is ignored by the compiler. Comments are useful for temporarily disabling code.

---

## Additional Knowledge

### The `main` Method in Detail

```java
public static void main(String[] args)
```

| Part | Meaning |
|------|---------|
| `public` | Callable from outside the class (required for JVM startup) |
| `static` | Called without creating an object of the class |
| `void` | Returns no value |
| `main` | Fixed name of the entry point |
| `String[] args` | Command-line arguments (optional for Hello World) |

### `println` vs. `print`

- `System.out.println("Text")` — output followed by a line break
- `System.out.print("Text")` — output without a line break

### Blocks and Curly Braces

`{ }` delimit code blocks (class body, method body). Every opening `{` needs a matching closing `}`.

### Compile Time vs. Runtime

- **Compile-time errors** (syntax, types, missing symbols) — reported by `javac`; the program does not start
- **Runtime errors** — occur during execution (e.g. `NullPointerException`); rare in Hello World

### IDE vs. Command Line

In an IDE (e.g. Cursor, IntelliJ), errors often appear while you type. On the command line, `javac` reports them when compiling. The rules are the same.

### Packages (Preview)

Larger projects use `package` declarations and folder structures (e.g. `package myapp;` in `myapp/MyClass.java`). Not needed yet for single-file exercises like this one.
