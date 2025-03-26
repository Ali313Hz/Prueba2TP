package models;


public class Ship {
    private final int size;
    private final String name;
    private final boolean[] hits;

    public Ship(int size, String name) {
        this.size = size;
        this.name = name;
        this.hits = new boolean[size];
    }

    public void hit(int position) {
        if (position >= 0 && position < size) {
            hits[position] = true;
        }
    }

    public boolean isSunk() {
        for (boolean hit : hits) {
            if (!hit) return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
