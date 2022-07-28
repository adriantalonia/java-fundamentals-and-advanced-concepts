package fundamentals._03_oop.constructor;

public class ParameterizedConstructor {

    int id;
    String name;

    //creating a parameterized constructor
    public ParameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating objects and passing values
        ParameterizedConstructor p1 = new ParameterizedConstructor(111, "test1");
        ParameterizedConstructor p2 = new ParameterizedConstructor(222, "test2");

        //calling method to display the values of object
        p1.display();
        p2.display();

    }
}
