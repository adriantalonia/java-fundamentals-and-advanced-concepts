package fundamentals.oop.abstraction;

interface DrawableSI {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class RectangleSI implements DrawableSI {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class StaticMethodInterface {
    public static void main(String args[]) {
        DrawableSI d = new RectangleSI();
        d.draw();
        System.out.println(DrawableSI.cube(3));
    }
}
