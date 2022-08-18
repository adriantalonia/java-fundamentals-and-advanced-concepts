## Difference between throw and throws in Java

The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly from a
method or a block of code whereas the throws keyword is used in signature of the method.

| Basis of Differences                                                                                                                                     | throw                                                                                                                                                     | throws                                                                                                                                             |
|----------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition                                                                                                                                               | Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.                                           | Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code. |
| Type of exception Using throw keyword, we can only propagate unchecked exception i.e., <br/>the checked exception cannot be propagated using throw only. | Using throws keyword, we can declare both checked and unchecked exceptions. However, the throws keyword can be used to propagate checked exceptions only. |                                                                                                                                                    |
| Syntax                                                                                                                                                   | The throw keyword is followed by an instance of Exception to be thrown.                                                                                   | The throws keyword is followed by class names of Exceptions to be thrown.                                                                          |
| Declaration                                                                                                                                              | throw is used within the method.                                                                                                                          | throws is used with the method signature.                                                                                                          |
| Internal implementation                                                                                                                                  | We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.                                                            | We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.    |

### Java throw Example

```java
public class TestThrow {
    //defining a method  
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        } else {
            System.out.println("Square of " + num + " is " + (num * num));
        }
    }

    //main method  
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.checkNum(-3);
        System.out.println("Rest of the code..");
    }
}
```

### Java throws Example

```java
public class TestThrows {
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    //main method  
    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.divideNum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
} 
```

### Java throw and throws Example

```java
public class TestThrowAndThrows {
    // defining a user-defined method  
// which throws ArithmeticException  
    static void method() throws ArithmeticException {
        System.out.println("Inside the method()");
        throw new ArithmeticException("throwing ArithmeticException");
    }

    //main method  
    public static void main(String args[]) {
        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("caught in main() method");
        }
    }
}
```

![image](https://static.javatpoint.com/core/images/difference-between-throw-and-throws-in-java3.png)

  
