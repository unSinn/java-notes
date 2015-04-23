# Reminders

  * Arrays are Objects ("byte[] a instanceof Object" is true)
  * _ $ are valid variablenames (@, 1 are not)
  * There can't be any code between the try and catch block
  * The method 's.concat("a")' does not alter 's' return value has to be assigned.
  * ArrayList has no sort()-method. Use Collections.sort(Comparable) instead.

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

### Literals

Different locations of brackets, all valid:
```java
int a = 14; // decimal: 14
int b = 015; // octal: 8 + 5 = 13
int c = 0x16; // hexadecimal: 16 + 6 = 22### Arrays
```

### Arrays
Different locations of brackets, all valid:
```java
int[] a;
int []b;
int c[];

a = new int[3];
a[0] = 42;
```
