## String Concatenation in Java

In Java, String concatenation forms a new String that is the combination of multiple strings. There are two ways to
concatenate strings in Java:

1. By + (String concatenation) operator
2. By concat() method

### 1) String Concatenation by + (String concatenation) operator

Java String concatenation operator (+) is used to add strings. For Example:

```java
class TestStringConcatenation1 {
    public static void main(String args[]) {
        String s = "Sachin" + " Tendulkar";
        System.out.println(s);//Sachin Tendulkar  
    }
}
```

Output:
> Sachin Tendulkar

The Java compiler transforms above code to this:

> String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();

In Java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method.
String concatenation operator produces a new String by appending the second operand onto the end of the first operand.
The String concatenation operator can concatenate not only String but primitive values also. For Example:

```java
class TestStringConcatenation2 {
    public static void main(String args[]) {
        String s = 50 + 30 + "Sachin" + 40 + 40;
        System.out.println(s);//80Sachin4040  
    }
}  
```

Output:
> 80Sachin4040

### 2) String Concatenation by concat() method

The String concat() method concatenates the specified string to the end of current string. Syntax:

public String concat(String another)  
Let's see the example of String concat() method.

```java
class TestStringConcatenation3 {
    public static void main(String args[]) {
        String s1 = "Sachin ";
        String s2 = "Tendulkar";
        String s3 = s1.concat(s2);
        System.out.println(s3);//Sachin Tendulkar  
    }
}
```

Output:
> Sachin Tendulkar

The above Java program, concatenates two String objects s1 and s2 using concat() method and stores the result into s3
object.

There are some other possible ways to concatenate Strings in Java,

#### 1. String concatenation using StringBuilder class

StringBuilder is class provides append() method to perform concatenation operation. The append() method accepts
arguments of different types like Objects, StringBuilder, int, char, CharSequence, boolean, float, double.
StringBuilder is the most popular and fastet way to concatenate strings in Java. It is mutable class which means
values stored in StringBuilder objects can be updated or changed.

```java
public class StrBuilder {
    /* Driver Code */
    public static void main(String args[]) {
        StringBuilder s1 = new StringBuilder("Hello");    //String 1  
        StringBuilder s2 = new StringBuilder(" World");    //String 2  
        StringBuilder s = s1.append(s2);   //String 3 to store the result  
        System.out.println(s.toString());  //Displays result  
    }
}  
```

In the above code snippet, s1, s2 and s are declared as objects of StringBuilder class. s stores the result of
concatenation of s1 and s2 using append() method.

#### 2. String concatenation using format() method

String.format() method allows to concatenate multiple strings using format specifier like %s followed by the string
values or objects.

```java
public class StrFormat {
    /* Driver Code */
    public static void main(String args[]) {
        String s1 = new String("Hello"); //String 1  
        String s2 = new String(" World"); //String 2  
        String s = String.format("%s%s", s1, s2); //String 3 to store the result  
        System.out.println(s.toString()); //Displays result  
    }
} 
```

#### 3. String concatenation using String.join() method (Java Version 8+)

The String.join() method is available in Java version 8 and all the above versions. String.join() method accepts
arguments first a separator and an array of String objects.

```java
public class StrJoin {
    /* Driver Code */
    public static void main(String args[]) {
        String s1 = new String("Hello");    //String 1  
        String s2 = new String(" World");    //String 2  
        String s = String.join("", s1, s2);   //String 3 to store the result  
        System.out.println(s.toString());  //Displays result  
    }
}  
```

#### 4. String concatenation using StringJoiner class (Java Version 8+)

StringJoiner class has all the functionalities of String.join() method. In advance its constructor can also accept
optional arguments, prefix and suffix.

```java
public class StrJoiner {
    /* Driver Code */
    public static void main(String args[]) {
        StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
        s.add("Hello");    //String 1   
        s.add("World");    //String 2  
        System.out.println(s.toString());  //Displays result  
    }
}
```

Output:
> Hello, World

#### 5. String concatenation using Collectors.joining() method (Java (Java Version 8+)

The Collectors class in Java 8 offers joining() method that concatenates the input elements in a similar order as they
occur.

```java
import java.util.*;
import java.util.stream.Collectors;

public class ColJoining {
    /* Driver Code */
    public static void main(String args[]) {
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
        String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
        System.out.println(str.toString());  //Displays result  
    }
}
```

Output:
> abc, pqr, xyz