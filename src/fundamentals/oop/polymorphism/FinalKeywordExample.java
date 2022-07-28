package fundamentals.oop.polymorphism;

/*final class A1 {

    final int count;

    A1() {
        count = 1; // initialize blank final variable
    }

    final void run() {
        System.out.println("running");
    }

    int cube(final int n) {
        n = n + 2;//can't be changed as n is final
        n * n * n;
    }
}

class B1 extends A1 { // 3) Stop Inheritance

    void run() { // 2) Stop methof overriding
        System.out.println("running safely with 100kmph");
    }
}


public class FinalKeywordExample {
    final int speedlimit = 90;//final variable

    void run() {
        speedlimit = 400; // 1) Stop value change
    }

    public static void main(String[] args) {
        FinalKeywordExample obj = new FinalKeywordExample();
        obj.run();

        B1 b1 = new B1();
        b1.run(); // final method is inherited but you cannot override it
    }
}*/
