package _01_fundamentals._03_oop.constructor;

public class DefaultConstructor {

    public DefaultConstructor() {
        System.out.println("DefaultConstructor is created");
    }

    //main method
    public static void main(String args[]) {
        //calling a default constructor
        DefaultConstructor b = new DefaultConstructor();
    }
}
