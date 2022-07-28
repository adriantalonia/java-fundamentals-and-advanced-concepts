package fundamentals._03_oop.constructor;

public class DefaultConstructor2 {
    int id;
    String name;

    //method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        DefaultConstructor2 d = new DefaultConstructor2();
        DefaultConstructor2 d2 = new DefaultConstructor2();

        d.display();
        d2.display();
    }
}
