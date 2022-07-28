package fundamentals.oop.method;

abstract class AbstractMethod { //abstract class
    //abstract method declaration
    abstract void display();
}

class MyClass extends AbstractMethod {
    //method impelmentation
    void display() {
        System.out.println("Abstract method?");
    }

    public static void main(String args[]) {
        //creating object of abstract class
        AbstractMethod obj = new MyClass();
        //invoking abstract method
        obj.display();
    }
}