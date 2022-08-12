## Java String Class Methods

The java.lang.String class provides a lot of built-in methods that are used to manipulate string in Java. By the help of
these methods, we can perform operations on String objects such as trimming, concatenating, converting, comparing,
replacing strings etc.

### Java String toUpperCase() and toLowerCase() method

The Java String toUpperCase() method converts this String into uppercase letter and String toLowerCase() method into
lowercase letter.

```java
public class Stringoperation1 {
    public static void main(String ar[]) {
        String s = "Sachin";
        System.out.println(s.toUpperCase());//SACHIN    
        System.out.println(s.toLowerCase());//sachin    
        System.out.println(s);//Sachin(no change in original)    
    }
}
```

### Java String trim() method

The String class trim() method eliminates white spaces before and after the String.

```java
public class Stringoperation2 {
    public static void main(String ar[]) {
        String s = "  Sachin  ";
        System.out.println(s);//  Sachin      
        System.out.println(s.trim());//Sachin    
    }
}
```

### Java String startsWith() and endsWith() method

The method startsWith() checks whether the String starts with the letters passed as arguments and endsWith() method
checks whether the String ends with the letters passed as arguments.

```java
public class Stringoperation3 {
    public static void main(String ar[]) {
        String s = "Sachin";
        System.out.println(s.startsWith("Sa"));//true    
        System.out.println(s.endsWith("n"));//true    
    }
}
```

### Java String charAt() Method

The String class charAt() method returns a character at specified index.

```java
public class Stringoperation4 {
    public static void main(String ar[]) {
        String s = "Sachin";
        System.out.println(s.charAt(0));//S    
        System.out.println(s.charAt(3));//h    
    }
}
```

### Java String length() Method

The String class length() method returns length of the specified String.

```java
public class Stringoperation5 {
    public static void main(String ar[]) {
        String s = "Sachin";
        System.out.println(s.length());//6    
    }
}
```

### Java String intern() Method

A pool of strings, initially empty, is maintained privately by the class String.

When the intern method is invoked, if the pool already contains a String equal to this String object as determined by
the equals(Object) method, then the String from the pool is returned. Otherwise, this String object is added to the pool
and a reference to this String object is returned.

```java
public class Stringoperation6 {
    public static void main(String ar[]) {
        String s = new String("Sachin");
        String s2 = s.intern();
        System.out.println(s2);//Sachin    
    }
}
```

### Java String valueOf() Method

The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into
String.

```java
public class Stringoperation7 {
    public static void main(String ar[]) {
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s + 10);
    }
}
```

### Java String replace() Method

The String class replace() method replaces all occurrence of first sequence of character with second sequence of
character.

```java
public class Stringoperation8 {
    public static void main(String ar[]) {
        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s1.replace("Java", "Kava");//replaces all occurrences of "Java" to "Kava"      
        System.out.println(replaceString);
    }
}
```

Output:
> Kava is a programming language. Kava is a platform. Kava is an Island.
     