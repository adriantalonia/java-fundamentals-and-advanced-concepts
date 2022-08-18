## Java throw Exception

In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of
runtime and we can create custom exceptions making the code recovery and debugging easier.

## Java throw keyword

The Java throw keyword is used to throw an exception explicitly.

We specify the exception object which is to be thrown. The Exception has some message with it that provides the error
description. These exceptions may be related to user inputs, server, etc.

We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom
exception.

**The syntax of the Java throw keyword is given below.**

> throw new exception_class("error message");

Let's see the example of throw IOException.

> throw new IOException("sorry device error");

### Java throw keyword Example

Example 1: Throwing Unchecked Exception
In this example, we have created a method named validate() that accepts an integer as a parameter. If the age is less
than 18, we are throwing the ArithmeticException otherwise print a message welcome to vote.

```java
public class TestThrow1 {
    //function to check if person is eligible to vote or not   
    public static void validate(int age) {
        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    //main method  
    public static void main(String args[]) {
        //calling the function  
        validate(13);
        System.out.println("rest of the code...");
    }
}
```