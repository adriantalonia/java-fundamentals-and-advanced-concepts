package fundamentals.oop.polymorphism;

interface Printable {
}

class A_ implements Printable {
    public void a() {
        System.out.println("a method");
    }
}

class B_ implements Printable {
    public void b() {
        System.out.println("b method");
    }
}

class Call {
    void invoke(Printable p) {//upcasting
        if (p instanceof A_) {
            A_ a = (A_) p;//Downcasting
            a.a();
        }
        if (p instanceof B_) {
            B_ b = (B_) p;//Downcasting
            b.b();
        }

    }
}

public class InstanceofExample {
    public static void main(String args[]) {
        Printable p = new B_();
        Call c = new Call();
        c.invoke(p);
    }
}
