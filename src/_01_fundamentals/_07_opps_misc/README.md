### Difference between object and class

| Object                                                                                                                                      | Class                                                              |
|---------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|
| Object is an instance of a class.                                                                                                           | Class is a blueprint or template from which objects are created.   |
| Object is a real world entity such as pen, laptop, mobile, bed, keyboard, mouse, chair etc.                                                 | Class is a group of similar objects.                               |
| Object is a physical entity.                                                                                                                | Class is a logical entity.                                         |
| Object is created through new keyword mainly e.g.Student s1=new Student();                                                                  | Class is declared using class keyword e.g.class Student{}          |
| Object is created many times as per requirement.                                                                                            | Class is declared once.                                            |
| Object allocates memory when it is created.                                                                                                 | Class doesn't allocated memory when it is created.                 |
| There are many ways to create object in java such as new keyword, newInstance() method, clone() method, factory method and deserialization. | There is only one way to define class in java using class keyword. |

Let's see some real life example of class and object in java to understand the difference well:

Class: Human Object: Man, Woman

Class: Fruit Object: Apple, Banana, Mango, Guava wtc.

Class: Mobile phone Object: iPhone, Samsung, Moto

Class: Food Object: Pizza, Burger, Samosa

### Difference between method overloading and method overriding in java

| Method Overloading                                                                                                                                                                                | Method Overriding                                                                                                           |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| Method overloading is used to increase the readability of the program.                                                                                                                            | Method overriding is used to provide the specific implementation of the method that is already provided by its super class. |
| Method overloading is performed within class.                                                                                                                                                     | Method overriding occurs in two classes that have IS-A (inheritance) relationship.                                          |
| In case of method overloading, parameter must be different.                                                                                                                                       | In case of method overriding, parameter must be same.                                                                       |
| Method overloading is the example of compile time polymorphism.                                                                                                                                   | Method overriding is the example of run time polymorphism.                                                                  |
| In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter. | Return type must be same or covariant in method overriding.                                                                 |

### Java Method Overloading example

```java
class OverloadingExample {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Java Method Overriding example

```java
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }
}  
```
