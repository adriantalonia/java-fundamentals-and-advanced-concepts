## Factory Method Design Pattern

According to GoF, this pattern “defines an interface for creating an object, but let subclasses decide which class to
instantiate. The Factory method lets a class defer instantiation to subclasses”.

### Example

![image](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)

```java
public interface Shape {
    void draw();
}
```

```java
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

```

```java
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
```

```java
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
```

```java
public class ShapeFactory {

    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
```

```java
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
```

```
Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
```

### Benefits

- Factory pattern offers an approach to code for interface rather than implementation.
- Factory pattern removes the instantiation of actual implementation classes from client code, making it more robust,
  less
  coupled and easy to extend. For example, we can easily change class implementation because client program is unaware
  of
  it.
- Factory pattern also provides abstraction between implementation and client classes through inheritance.