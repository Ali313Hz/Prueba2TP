package models;


public class Ship {
    private final ShipType type;
    private final boolean[] hits;

    public Ship(ShipType type) {
        this.type = type;
        this.hits = new boolean[type.getSize()];
    }

    public void hit(int position) {
        if (position >= 0 && position < type.getSize()) {
            hits[position] = true;
        }
    }

    public boolean isSunk() {
        for (boolean hit : hits) {
            if (!hit) return false;
        }
        return true;
    }

    public String getStatus() {
        int hitCount = 0;
        for (boolean hit : hits) {
            if (hit) hitCount++;
        }
        return isSunk() ? "🔥 Hundido" : "Golpes: " + hitCount + "/" + type.getSize();
    }

    public String getName() {
        return type.getName();
    }

    public int getSize() {
        return type.getSize();
    }
}