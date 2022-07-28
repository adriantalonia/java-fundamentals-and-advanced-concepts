package fundamentals.oop.interfaces;

interface MultipleInterfaces {
}

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A7 implements Printable1, Showable1 {
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