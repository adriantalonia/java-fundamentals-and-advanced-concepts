package fundamentals._03_oop.initialize;

public class ByMethod {
    public static void main(String[] args) {
        Method m1=new Method();
        Method m2=new Method();
        m1.insertRecord(111,"Karan");
        m2.insertRecord(222,"Aryan");
        m1.displayInformation();
        m2.displayInformation();
    }
}

class Method {
    int id;
    String name;

    void insertRecord(int r, String n) {
        id = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}