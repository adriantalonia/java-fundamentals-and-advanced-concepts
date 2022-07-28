package _01_fundamentals._03_oop.abstraction;

//Interface declaration: by first user
interface Drawable {
    void draw();
}

//Implementation: by second user
class RectangleI implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class CircleI implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class InterfaceExample2 {
    public static void main(String args[]) {
        Drawable d = new CircleI();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }
}
