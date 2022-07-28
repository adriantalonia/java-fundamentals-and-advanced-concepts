package _01_fundamentals._03_oop.polymorphism;

class Adder2 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingChangingDataTypeArguments {
    public static void main(String[] args) {
        System.out.println(Adder2.add(5, 6));
        System.out.println(Adder2.add(2.5, 5.5));
    }
}
