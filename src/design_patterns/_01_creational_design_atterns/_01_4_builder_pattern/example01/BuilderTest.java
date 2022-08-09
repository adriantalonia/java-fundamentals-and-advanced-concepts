package design_patterns._01_creational_design_atterns._01_4_builder_pattern.example01;

public class BuilderTest {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: " + house);
    }
}