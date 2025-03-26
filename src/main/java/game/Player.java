package game;


import models.Ship;
import java.util.ArrayList;
import java.util.Random;

public class Player {
    private String name;
    private ArrayList<Ship> ships;
    private Random rand = new Random();

    public Player(String name) {
        this.name = name;
        this.ships = new ArrayList<>();
    }

    public void addShip(Ship ship) {
        if (ships.size() < 3) {
            ships.add(ship);
        } else {
            System.out.println("Máximo de 3 barcos alcanzado.");
        }
    }

    public boolean attack(Player opponent) {
        if (opponent.ships.isEmpty()) return false;

        int shipIndex = rand.nextInt(opponent.ships.size());
        Ship ship = opponent.ships.get(shipIndex);
        int position = rand.nextInt(ship.getSize());

        ship.hit(position);
        System.out.println(name + " ataca la posición " + position + " del barco " + ship.getName());

        if (ship.isSunk()) {
            System.out.println("¡" + ship.getName() + " hundido!");
            opponent.ships.remove(ship);
        }

        return !opponent.ships.isEmpty();
    }

    public boolean hasShips() {
        return !ships.isEmpty();
    }

    public String getName() {
        return name;
    }
}
