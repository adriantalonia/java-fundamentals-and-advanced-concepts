package design_patterns._01_creational_design_atterns._01_3_abstract_factory.example01;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();
        LenovoMobileFactory lmf = (LenovoMobileFactory) factory.createMobile("lenf");
        Lenovo ln = (Lenovo) lmf.createLenovoMobile();
        ln.pictureCapacity();
    }
}
