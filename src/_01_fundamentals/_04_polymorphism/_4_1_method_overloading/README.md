## Method Overloading in Java

If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

Different ways to overload the method
There are two ways to overload the method in java

1) By changing number of arguments
2) By changing the data type

### 1) Method Overloading: changing no. of arguments

```java
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }
}  
```

```
Output:
22 
33
```

### 2) Method Overloading: changing data type of arguments

```java
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6));
    }
}  
```

```
Output:
22 
24.9
```

### Q) Why Method Overloading is not possible by changing the return type of method only?

In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's
see how ambiguity may occur:

```java
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(int a, int b) {
        return a + b;
    }
}

class TestOverloading3 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));//ambiguity  
    }
}  
```

### Method Overloading and Type Promotion

![image](https://static.javatpoint.com/images/java-type-promotion.png)

### Example of Method Overloading with TypePromotion

```java
class OverloadingCalculation1{  
  void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  OverloadingCalculation1 obj=new OverloadingCalculation1();  
  obj.sum(20,20);//now second int literal will be promoted to long  
  obj.sum(20,20,20);  
  
  }  
} 
``