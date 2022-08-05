package design_patterns._01_creational_design_atterns._01_2_factory_pattern.example01;

public interface IMobile {
    public void cost();

    public void pictureCapacity();

    public void batteryPower();
}

class Lenovo implements IMobile {

    @Override
    public void cost() {
        System.out.println("Lenovo Cost starts from 10000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Lenovo camera capacity starts from 10 MP");
    }

    @Override
    public void batteryPower() {
        System.out.println("Lenovo battery power starts from 2500 MAh");
    }
}

class Samsung implements IMobile {

    @Override
    public void cost() {
        System.out.println("Samsung Cost starts from 6000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Samsung camera capacity starts from 4 MP");
    }

    @Override
    public void batteryPower() {
        System.out.println("Samsung battery power starts from 1200 MAh");
    }
}