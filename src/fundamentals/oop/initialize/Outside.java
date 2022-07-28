package fundamentals.oop.initialize;

public class Outside {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.id);
        System.out.println(ex.name);
    }
}

//Java Program to demonstrate having the main method in
//another class
//Creating Student class.
class Example {
    int id;
    String name;
}