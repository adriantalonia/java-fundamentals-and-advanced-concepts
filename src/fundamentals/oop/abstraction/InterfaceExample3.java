package fundamentals.oop.abstraction;

interface BankI {
    float rateOfInterest();
}

class SBII implements BankI {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNBI implements BankI {
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        BankI b = new SBII();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
