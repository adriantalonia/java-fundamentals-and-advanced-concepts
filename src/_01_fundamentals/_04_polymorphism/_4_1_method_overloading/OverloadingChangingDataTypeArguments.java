package _01_fundamentals._04_polymorphism._4_1_method_overloading;

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
        System.out.println(Adder2.add(11, 11));
        System.out.println(Adder2.add(12.3, 12.6));
    }
}
