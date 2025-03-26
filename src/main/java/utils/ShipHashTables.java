package utils;


import java.util.HashMap;
import java.util.Map;

class ShipInfo {
    String name;
    int number;
    String type;
    int level;

    public ShipInfo(String name, int number, String type, int level) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.level = level;
    }
}

public class ShipHashTables {
    private Map<String, ShipInfo> typeTable = new HashMap<>();
    private Map<Integer, ShipInfo> numberTable = new HashMap<>();
    private Map<String, ShipInfo> nameTable = new HashMap<>();

    public void addShip(ShipInfo ship) {
        typeTable.put(ship.type, ship);
        numberTable.put(ship.number, ship);
        nameTable.put(ship.name, ship);
    }
}
