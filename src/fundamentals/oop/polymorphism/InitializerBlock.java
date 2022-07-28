package fundamentals.oop.polymorphism;

public class InitializerBlock {

    int speed;

    InitializerBlock() {
        System.out.println("speed is " + speed);
    }

    {
        speed = 100;
    }

    public static void main(String args[]) {
        InitializerBlock unit1 = new InitializerBlock();
        InitializerBlock init2 = new InitializerBlock();
    }
}
