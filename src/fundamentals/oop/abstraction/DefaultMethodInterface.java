package fundamentals.oop.abstraction;

interface DrawableDI {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}

class RectangleDI implements DrawableDI {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class DefaultMethodInterface {

    public static void main(String args[]) {
        DrawableDI d = new RectangleDI();
        d.draw();
        d.msg();
    }
}
