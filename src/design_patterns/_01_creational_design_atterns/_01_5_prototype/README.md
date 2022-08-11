## Prototype Pattern

Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing
object rather than creating a new instance from scratch, something that may include costly operations. The existing
object acts as a prototype and contains the state of the object. The newly copied object may change same properties only
if required. This approach saves costly resources and time, especially when object creation is a heavy process.

The prototype pattern is a creational design pattern. Prototype patterns are required, when object creation is time
consuming, and costly operation, so we create objects with the existing object itself. One of the best available ways to
create an object from existing objects is the clone() method. Clone is the simplest approach to implement a prototype
pattern. However, it is your call to decide how to copy existing object based on your business model.

### Prototype Design Participants

1) Prototype : This is the prototype of an actual object.
2) Prototype registry : This is used as a registry service to have all prototypes accessible using simple string
   parameters.
3) Client : Client will be responsible for using registry service to access prototype instances.

### When to use the Prototype Design Pattern

When a system should be independent of how its products are created, composed, and represented and
When the classes to instantiate are specified at run-time.
For example,

1) By dynamic loading or To avoid building a class hierarchy of factories that parallels the class hierarchy of products
   or
2) When instances of a class can have one of only a few different combinations of state. It may be more convenient to
   install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time
   with the appropriate state.

![image](https://media.geeksforgeeks.org/wp-content/uploads/download-1.png)

```java
// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a ColorStore class to store existing objects.

import java.util.HashMap;
import java.util.Map;


abstract class Color implements Cloneable {

    protected String colorName;

    abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class blueColor extends Color {
    public blueColor() {
        this.colorName = "blue";
    }

    @Override
    void addColor() {
        System.out.println("Blue color added");
    }

}

class blackColor extends Color {

    public blackColor() {
        this.colorName = "black";
    }

    @Override
    void addColor() {
        System.out.println("Black color added");
    }
}

class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("blue", new blueColor());
        colorMap.put("black", new blackColor());
    }

    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}


// Driver class
class Prototype {
    public static void main(String[] args) {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
    }
}

```