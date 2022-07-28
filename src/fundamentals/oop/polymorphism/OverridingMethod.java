package fundamentals.oop.polymorphism;

class Vehicle {
    //defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike2 extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class OverridingMethod {
    public static void main(String[] args) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
