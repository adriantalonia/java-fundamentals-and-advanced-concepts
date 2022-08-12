## Substring in Java

A part of String is called substring. In other words, substring is a subset of another String. Java String class
provides the built-in substring() method that extract a substring from the given string by using the index values passed
as an argument. In case of substring() method startIndex is inclusive and endIndex is exclusive.

You can get substring from the given String object by one of the two methods:

1. **public String substring(int startIndex):**
   This method returns new String object containing the substring of the given string from specified startIndex (
   inclusive)
   . The method throws an IndexOutOfBoundException when the startIndex is larger than the length of String or less than
   zero.
2. **public String substring(int startIndex, int endIndex):**
   This method returns new String object containing the substring of the given string from specified startIndex to
   endIndex. The method throws an IndexOutOfBoundException when the startIndex is less than zero or startIndex is
   greater
   than endIndex or endIndex is greater than length of String.

#### In case of String:

- startIndex: inclusive
- endIndex: exclusive

Let's understand the startIndex and endIndex by the code given below.

```
String s="hello";    
System.out.println(s.substring(0,2)); //returns he  as a substring
```

n the above substring, 0 points the first letter and 2 points the second letter i.e., e (because end index is exclusive)
.

Example of Java substring() method

```java
public class TestSubstring {
    public static void main(String args[]) {
        String s = "SachinTendulkar";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 6: " + s.substring(6));//Tendulkar    
        System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); //Sachin  
    }
}
```

Output:

```
Original String: SachinTendulkar
Substring starting from index 6: Tendulkar
Substring starting from index 0 to 6: Sachin
```

### Using String.split() method:

The split() method of String class can be used to extract a substring from a sentence. It accepts arguments in the form
of a regular expression.

```java
import java.util.*;

public class TestSubstring2 {
    /* Driver Code */
    public static void main(String args[]) {
        String text = new String("Hello, My name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
```

Output:

```
[Hello,  My name is Sachin]
```

In the above program, we have used the split() method. It accepts an argument \\. that checks a in the sentence and
splits the string into another string. It is stored in an array of String objects sentences.

