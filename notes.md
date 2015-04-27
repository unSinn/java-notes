# Reminders

  * Arrays are Objects (`byte[] a instanceof Object` is true)
  * `_` `$` are valid variablenames (@, 1 are not)
  * There can't be any code between the try and catch block
  * The method 's.concat("a")' does not alter 's' return value has to be assigned.
  * ArrayList has no sort()-method. Use Collections.sort(Comparable) instead.
  * int has  -2^31 (-2147483648) and a maximum value of  2^31 -1 (2147483647)
  * `package` has to be in front of `import`
  * The default value of `String` is `null` (like any other `Object`)
  * The call of a super() constructor has to be on the first line.
  * Interface methods are public by default.


  ### &, &&, |, || and booleans
  * & verifies both operands: `(x != 0) & (1/x > 1)` will throw an Exception if x=0.
  * && stops evaluating if the first operand evaluates to false since the result will be false `(x != 0) && (1/x > 1)` won't throw an Exception.
  * `a | b` this means evaluate a then evaluate b then do the |.
  * `a || b`  while this means evaluate a and only if this is false then evaluate b.

### Compiling
To compile a Class `HellWorld` in the File `HelloWorld.java`

```bash
javac HelloWorld.java
```
To compile from `/proj/src` with the a class `A` in package `top.sub`:

```bash
javac -d /proj/bin top/sub/A.java
```
Produces the output `/proj/src/bin/top/sub/A.class`.

### variables can be overwritten in local scope

```java
class Ex1{
  static int x = 10;  
  public static void main(String[] args) {
    for(int x=0;x<5;x++){
    }
    System.out.print(x);
  }
}
```
`10`

Even if the local variable is defined as metheod parameter

```java
class Ex1{
  public static void main(String args[]){
    int x = 10;
    int y = new Ex1().change(x);
    System.out.print(x+y);
  }
  int change(int x){
    x=12;
    return x;
  }
}
```
`22`

### Precedence and Associativity

Some Operators have left-to-right Associativity and thus operators with the same Precedence are resolved from left to right no matter what datatype:
```java
System.out.println(1 + 2 + "3"); // 33
System.out.println("3" + 2 + 1.0f); // 321.0
```

However operators with higher Precedence are resolved first:
```java
System.out.println("3" + 2 * 1.0f); // 32.0
```

Some operators have right-to-left Associativity:

```java
public static void main(String[] args) {
  int a = 1;
  int b = 2;
  System.out.println(a = b = fuufi() + 5); // 10
}
private static int fuufi() {
	return 5;
}
```

### Literals

```java
int a = 14; // decimal: 14
int b = 015; // octal: 8 + 5 = 13
int c = 0x16; // hexadecimal: 16 + 6 = 22
String s = "Blubb";
```

Where `14_000`, `015`, `0x16` are called primitive literals and `"Blubb"` is a String literal.

### Widening and Boxing
#### Widening
```java
long a = 1 + 5l;
```

#### Boxing
```java
Integer b = 1 + 5;
```
#### Method selection
Java will first choose methods that widen the variables, then those box them and then look for VarArgs.

### Arrays
Different locations of brackets, all valid:
```java
int[] a;
int []b;
int c[];
int[] []d[];
```
