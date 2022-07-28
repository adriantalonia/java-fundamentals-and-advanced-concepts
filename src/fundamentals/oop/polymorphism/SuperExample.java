package fundamentals.oop.polymorphism;

class Animal {
    String color = "white";

    Animal() {
        System.out.println("animal is created");
    }

    void eat() {
        System.out.println("eating...Animal");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        super();
        System.out.println("dog is created");
    }

    void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }

    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...Dog");
    }

    void work() {
        super.eat(); //access parent method
        bark();
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();

        d.work();
    }
}
