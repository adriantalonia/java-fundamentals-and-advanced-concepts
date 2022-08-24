package design_patterns._02_structural_design_patterns._02_2_adapter.example01;

public class BirdAdapter implements ToyDuck {
    // You need to implement the interface your
    // client expects to use.
    Bird bird;

    public BirdAdapter(Bird bird) {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}