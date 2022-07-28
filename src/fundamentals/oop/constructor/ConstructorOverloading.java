package fundamentals.oop.constructor;

public class ConstructorOverloading {

    int id;
    String name;
    int age;

    public ConstructorOverloading(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public ConstructorOverloading(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading(111, 15);
        ConstructorOverloading co2 = new ConstructorOverloading(222, "test2", 29);

        co.display();
        co2.display();
    }
}
