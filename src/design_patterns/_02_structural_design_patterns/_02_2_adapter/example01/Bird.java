package design_patterns._02_structural_design_patterns._02_2_adapter.example01;

interface Bird {
    // birds implement Bird interface that allows
    // them to fly and make sounds adaptee interface
    public void fly();

    public void makeSound();
}

class Sparrow implements Bird {
    // a concrete implementation of bird
    public void fly() {
        System.out.println("Flying");
    }

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}