package _01_fundamentals._03_oop.polymorphism;

class StaticBinding {
    void staticBindingMethod() {
        System.out.println("StaticBinding...");
    }
}

class DynamicBinding {
    void dynamicBindingMethod() {
        System.out.println("DynamicBindingMethod parent...");
    }
}

class DBChild extends DynamicBinding {
    void dynamicBindingMethod() {
        System.out.println("DynamicBindingMethod child...");
    }
}

public class StaticAndDynamicBinding {

    public static void main(String args[]) {
        StaticBinding sb = new StaticBinding();
        sb.staticBindingMethod();

        DynamicBinding db = new DBChild();
        db.dynamicBindingMethod();
    }
}
