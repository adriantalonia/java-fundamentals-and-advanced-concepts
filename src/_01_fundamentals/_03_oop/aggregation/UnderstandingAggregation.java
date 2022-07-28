package _01_fundamentals._03_oop.aggregation;

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}

public class UnderstandingAggregation {

    public static void main(String[] args) {
        Address address1 = new Address("Monterrey", "N.L.", "Mexico");
        Address address2 = new Address("Los Angeles", "California", "USA");

        Emp e = new Emp(111, "Adrian", address1);
        Emp e2 = new Emp(112, "Eduardo", address2);

        e.display();
        e2.display();
    }
}
