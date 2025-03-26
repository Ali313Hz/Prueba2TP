package models;


public enum ShipType {
    BATTLESHIP(5, "Battleship"),
    FRIGATE(3, "Frigate"),
    CANOE(1, "Canoe");

    private final int size;
    private final String name;

    ShipType(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
