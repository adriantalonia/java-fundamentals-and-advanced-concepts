package fundamentals.oop.interfaces;

interface InterfaceExample01 {
    void print();
}

class A6 implements InterfaceExample01 {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
