## Java String compare

We can compare String in Java on the basis of content and reference.

It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator)
etc.

**There are three ways to compare String in Java:**

1. By Using equals() Method
2. By Using == Operator
3. By compareTo() Method

### 1) By Using equals() Method

The String class equals() method compares the original content of the string. It compares values of string for equality.
String class provides the following two methods:

- public boolean equals(Object another) compares this string to the specified object.
- public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.

```java
class Teststringcomparison1 {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2));//true  
        System.out.println(s1.equals(s3));//true  
        System.out.println(s1.equals(s4));//false  
    }
}  
```

**Output:**

```
true
true
false
```

In the above code, two strings are compared using equals() method of String class. And the result is printed as boolean
values, true or false.

```java
class Teststringcomparison2 {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "SACHIN";

        System.out.println(s1.equals(s2));//false  
        System.out.println(s1.equalsIgnoreCase(s2));//true  
    }
}
```

**Output:**

```
false
true
```

In the above program, the methods of String class are used. The equals() method returns true if String objects are
matching and both strings are of same case. equalsIgnoreCase() returns true regardless of cases of strings.

### 2) By Using == operator

The == operator compares references not values.

```java
class Teststringcomparison3 {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1 == s2);//true (because both refer to same instance)  
        System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)  
    }
} 
```

**Output:**

```
true
false
```

### 3) By Using compareTo() method

The String class compareTo() method compares values lexicographically and returns an integer value that describes if
first string is less than, equal to or greater than second string.

Suppose s1 and s2 are two String objects. If:

- s1 == s2 : The method returns 0.
- s1 > s2 : The method returns a positive value.
- s1 < s2 : The method returns a negative value.

```java
class Teststringcomparison4 {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
    }
} 
```

**Output:**

```
0
1
-1
```


