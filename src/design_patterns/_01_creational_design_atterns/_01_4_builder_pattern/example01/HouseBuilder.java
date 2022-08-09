package design_patterns._01_creational_design_atterns._01_4_builder_pattern.example01;

interface HouseBuilder {

    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}

class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    public House getHouse() {
        return this.house;
    }
}

class TipiHouseBuilder implements HouseBuilder {
    private House house;

    public TipiHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    public void buildInterior() {
        house.setInterior("Fire Wood");
    }

    public void buildRoof() {
        house.setRoof("Wood, caribou and seal skins");
    }

    public House getHouse() {
        return this.house;
    }

}