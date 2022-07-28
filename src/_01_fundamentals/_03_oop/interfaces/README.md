## Interface in Java

An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface,
not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

## Why use Java interface?

There are mainly three reasons to use interface. They are given below.

- It is used to achieve abstraction.
- By interface, we can support the functionality of multiple inheritance.
- It can be used to achieve loose coupling.

```java
interface interface_name {
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  
```

The relationship between classes and interfaces
As shown in the figure given below, a class extends another class, an interface extends another interface, but a class
implements an interface.

![image](https://static.javatpoint.com/images/core/interfacerelation.jpg)

```java
interface printable {
    void print();
}

class A6 implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}  
```

## Multiple inheritance in Java by interface

If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple
inheritance.

![image](https://static.javatpoint.com/images/core/multipleinheritance.jpg)

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A7 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
```

## Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?

As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of
ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its
implementation is provided by the implementation class. For example:

## Interface inheritance

A class implements an interface, but one interface extends another interface.

```java
interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class TestInterface4 implements Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}  
```

## Java 8 Default Method in Interface

Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:

```java
interface Drawable {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceDefault {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
    }
}
```

## Java 8 Static Method in Interface

Since Java 8, we can have static method in interface. Let's see an example:

```java
interface Drawable {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceStatic {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }
}  
```