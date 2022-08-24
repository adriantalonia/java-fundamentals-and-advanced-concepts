package design_patterns._02_structural_design_patterns._02_2_adapter.example01;

interface ToyDuck {
    // target interface
    // toyducks dont fly they just make
    // squeaking sound
    public void squeak();
}

class PlasticToyDuck implements ToyDuck {
    public void squeak() {
        System.out.println("Squeak");
    }
}