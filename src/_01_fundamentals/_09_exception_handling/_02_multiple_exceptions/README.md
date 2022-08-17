## Java Catch Multiple Exceptions

### Java Multi-catch block

A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler.
So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.

### Points to remember

At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before
catch for Exception.

![image](https://static.javatpoint.com/core/images/multiple-catch-block-in-java.png)

Example 1
Let's see a simple example of java multi-catch block.

```java
public class MultipleCatchBlock1 {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
```

Output:

```
Arithmetic Exception occurs
rest of the code
```


