package game;


import models.Ship;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Ship> ships;

    public Board() {
        this.ships = new ArrayList<>();
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public List<Ship> getShips() {
        return ships;
    }
}
