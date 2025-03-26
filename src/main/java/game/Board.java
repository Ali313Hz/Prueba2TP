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

    public void showBoard(String playerName) {
        System.out.println("\n📜 Estado del Tablero de " + playerName + ":");
        if (ships.isEmpty()) {
            System.out.println("🚢 ¡No quedan barcos en el tablero!");
        } else {
            for (Ship ship : ships) {
                System.out.println(" - " + ship.getName() + " [" + ship.getStatus() + "]");
            }
        }
        System.out.println("------------------------------------");
    }
}
