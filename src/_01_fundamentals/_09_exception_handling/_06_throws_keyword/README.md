## Java throws keyword

The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur
an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the
program can be maintained.

Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as
NullPointerException, it is programmers' fault that he is not checking the code before it being used.

#### Syntax of Java throws

```
return_type method_name() throws exception_class_name{  
//method code  
}  
```

### Which exception should be declared?

**Ans: Checked exception only, because:**

- unchecked exception: under our control so we can correct our code.
- error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or
  StackOverflowError.

**Advantage of Java throws keyword**

Now Checked Exception can be propagated (forwarded in call stack).

It provides information to the caller of the method about the exception.

### Java throws Example

Let's see the example of Java throws clause which describes that checked exceptions can be propagated by throws keyword.

```java
import java.io.IOException;

class Testthrows1 {
    void m() throws IOException {
        throw new IOException("device error");//checked exception  
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        Testthrows1 obj = new Testthrows1();
        obj.p();
        System.out.println("normal flow...");
    }
} 
```

Output:

```
exception handled
normal flow...
```

### There are two cases:

- Case 1: We have caught the exception i.e. we have handled the exception using try/catch block.
- Case 2: We have declared the exception i.e. specified throws keyword with the method.

### Case 1: Handle Exception Using try-catch block

In case we handle the exception, the code will be executed fine whether exception occurs during the program or not.

```java
import java.io.*;

class M {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

public class Testthrows2 {
    public static void main(String args[]) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
} 
```

Output:

```
exception handled
normal flow...
```

### Case 2: Declare Exception

- In case we declare the exception, if exception does not occur, the code will be executed fine.
- In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle
  the exception.

Let's see examples for both the scenario.

#### A) If exception does not occur

```java
import java.io.*;

class M {
    void method() throws IOException {
        System.out.println("device operation performed");
    }
}

class Testthrows3 {
    public static void main(String args[]) throws IOException {//declare exception  
        M m = new M();
        m.method();

        System.out.println("normal flow...");
    }
}
```

Output:

```
device operation performed
normal flow...
```

#### B) If exception occurs

```java
import java.io.*;

class M {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

class Testthrows4 {
    public static void main(String args[]) throws IOException {//declare exception  
        M m = new M();
        m.method();

        System.out.println("normal flow...");
    }
}
```

Output:

![image](https://static.javatpoint.com/core/images/throws-keyword-and-difference-between-throw-and-throws.png)
 







