package design_patterns._01_creational_design_atterns._01_3_abstract_factory.example01;

interface IMobileFactory {

    IMobileFactory createMobile(String type);
}

class MobileFactory implements IMobileFactory {

    @Override
    public IMobileFactory createMobile(String type) {

        IMobileFactory mob = null;
        if ("lenf".equalsIgnoreCase(type)) {
            mob = new LenovoMobileFactory();
        } else if ("samf".equalsIgnoreCase(type)) {
            mob = new SamsungMobileFactory();
        }
        return mob;
    }
}

class LenovoMobileFactory extends MobileFactory {

    Lenovo createLenovoMobile() {
        return new Lenovo();
    }
}

class SamsungMobileFactory extends MobileFactory {

    Samsung createSamsungMobile() {
        return new Samsung();
    }
}