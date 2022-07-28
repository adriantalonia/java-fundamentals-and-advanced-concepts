package _01_fundamentals._03_oop.abstraction;

interface PrintableI{
    void print();
}
interface ShowableI extends PrintableI{
    void show();
}

public class InterfaceInheritanceExample implements ShowableI {
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    public static void main(String args[]){
        InterfaceInheritanceExample obj = new InterfaceInheritanceExample();
        obj.print();
        obj.show();
    }
}
