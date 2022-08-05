package design_patterns._01_creational_design_atterns._01_2_factory_pattern.example01;

public class FactoryTest {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();

        Lenovo len = (Lenovo) factory.createMobile("len");
        len.batteryPower();

        Samsung sam = (Samsung) factory.createMobile("sam");
        sam.cost();
    }
}
