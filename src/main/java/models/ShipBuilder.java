package models;


public class ShipBuilder {
    private int size;
    private String name;

    public ShipBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public ShipBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Ship build() {
        return new Ship(size, name);
    }
}
