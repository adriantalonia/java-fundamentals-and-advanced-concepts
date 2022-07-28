package fundamentals.oop.abstraction;

interface Printable{
    void print();
}
interface Showable{
    void show();
}

public class MultipleInheritanceExample implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.print();
        obj.show();
    }
}
