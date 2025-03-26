package models;



public class ShipBuilder {
    private ShipType type;

    public ShipBuilder setType(ShipType type) {
        this.type = type;
        return this;
    }

    public Ship build() {
        return new Ship(type);
    }
}