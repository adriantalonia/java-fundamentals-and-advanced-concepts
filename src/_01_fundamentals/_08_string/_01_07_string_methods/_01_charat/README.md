## Java String charAt()

The Java String class charAt() method returns a char value at the given index number.

The index number starts from 0 and goes to n-1, where n is the length of the string. It returns
StringIndexOutOfBoundsException, if the given index number is greater than or equal to this string length or a negative
number.

Syntax
> public char charAt(int index)

The method accepts index as a parameter. The starting index is 0. It returns a character at a specific index position in
a string. It throws StringIndexOutOfBoundsException if the index is a negative value or greater than this string length.

Specified by

CharSequence interface, located inside java.lang package.

Internal implementation

```java
public char charAt(int index){
        if((index< 0)||(index>=value.length)){
        throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
        }
```

### Java String charAt() Method Examples

Let's see Java program related to string in which we will use charAt() method that perform some operation on the give
string.

```java
public class CharAtExample {
    public static void main(String args[]) {
        String name = "javatpoint";
        char ch = name.charAt(4);//returns the char value at the 4th index  
        System.out.println(ch);
    }
}  
```

Output:
> t

#### Accessing First and Last Character by Using the charAt() Method

Let's see a simple example where we are accessing first and last character from the provided string.

```java
public class CharAtExample3 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        int strLength = str.length();
// Fetching first character  
        System.out.println("Character at 0 index is: " + str.charAt(0));
// The last Character is present at the string length-1 index  
        System.out.println("Character at last index is: " + str.charAt(strLength - 1));
    }
}
```

Output:

```
Character at 0 index is: W
Character at last index is: l
```

#### Print Characters Presented at Odd Positions by Using the charAt() Method

Let's see an example where we are accessing all the elements present at odd index.

```java
public class CharAtExample4 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (i % 2 != 0) {
                System.out.println("Char at " + i + " place " + str.charAt(i));
            }
        }
    }
}
```

Output:

```
Char at 1 place e
Char at 3 place c
Char at 5 place m
Char at 7 place  
Char at 9 place o
Char at 11 place J
Char at 13 place v
Char at 15 place t
Char at 17 place o
Char at 19 place n
Char at 21 place  
Char at 23 place o
Char at 25 place t
Char at 27 place l
```

#### Counting Frequency of a character in a String by Using the charAt() Method

Let's see an example in which we are counting frequency of a character in the given string.

```java
public class CharAtExample5 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 't') {
                count++;
            }
        }
        System.out.println("Frequency of t is: " + count);
    }
}
```

Output:
> Frequency of t is: 4

#### Counting the Number of Vowels in a String by Using the chatAt() Method

Let's see an example where we are counting the number of vowels present in a string with the help of the charAt()
method.

```java
// import statement  

import java.util.*;

public class CharAtExample6 {
    ArrayList<Character> al;

    // constructor for creating and   
// assigning values to the ArrayList al  
    CharAtExample6() {
        al = new ArrayList<Character>();
        al.add('A');
        al.add('E');
        al.add('a');
        al.add('e');
        al.add('I');
        al.add('O');
        al.add('i');
        al.add('o');
        al.add('U');
        al.add('u');
    }

    // a method that checks whether the character c is a vowel or not     
    private boolean isVowel(char c) {
        for (int i = 0; i < al.size(); i++) {
            if (c == al.get(i)) {
                return true;
            }
        }
        return false;
    }

    // a method that calculates vowels in the String s  
    public int countVowels(String s) {
        int countVowel = 0; // store total number of vowels  
        int size = s.length(); // size of string  
        for (int j = 0; j < size; j++) {
            char c = s.charAt(j);
            if (isVowel(c)) {
// vowel found!  
// increase the count by 1  
                countVowel = countVowel + 1;
            }
        }

        return countVowel;
    }

    // main method  
    public static void main(String argvs[]) {
// creating an object of the class CharAtExample6  
        CharAtExample6 obj = new CharAtExample6();

        String str = "Javatpoint is a great site for learning Java.";

        int noOfVowel = obj.countVowels(str);

        System.out.println("String: " + str);

        System.out.println("Total number of vowels in the string are: " + noOfVowel + "\n");

        str = "One apple in a day keeps doctor away.";

        System.out.println("String: " + str);

        noOfVowel = obj.countVowels(str);

        System.out.println("Total number of vowels in the string are: " + noOfVowel);
    }
}
```

Output:

```
String: Javatpoint is a great site for learning Java.
Total number of vowels in the string are: 16

String: One apple in a day keeps doctor away.
Total number of vowels in the string are: 13
```
