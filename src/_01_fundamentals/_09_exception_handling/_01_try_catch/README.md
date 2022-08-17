## Java try-catch block

Java try block is used to enclose the code that might throw an exception. It must be used within the method.

If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it
is recommended not to keep the code in try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

- Syntax of Java try-catch

```java
try{
//code that may throw an exception    
        }catch(Exception_class_Name ref){}
```

- Syntax of try-finally block

```java
try{
//code that may throw an exception    
        }finally{}
```

### Java catch block

Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared
exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good
approach is to declare the generated type of exception.

The catch block must be used after the try block only. You can use multiple catch block with a single try block.

#### Internal Working of Java try-catch block

![image](https://static.javatpoint.com/core/images/java-try-catch-block.png)

The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default
exception handler that performs the following tasks:

Prints out exception description.
Prints the stack trace (Hierarchy of methods where the exception occurred).
Causes the program to terminate.
But if the application programmer handles the exception, the normal flow of the application is maintained, i.e., rest of
the code is executed.

## Example

```java
public class TryCatchExample4 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception   
        }
        // handling the exception by using Exception class      
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}  
```

Output:
```
java.lang.ArithmeticException: / by zero
rest of the code
```

