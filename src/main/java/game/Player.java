package game;


import models.Ship;
import java.util.ArrayList;
import java.util.Random;





public class Player {
    private final String name;
    private final Board board;
    private final Random rand = new Random();

    public Player(String name) {
        this.name = name;
        this.board = new Board();
    }

    public void addShip(Ship ship) {
        board.addShip(ship);
    }

    public boolean attack(Player opponent) {
        if (opponent.board.getShips().isEmpty()) return false;

        int shipIndex = rand.nextInt(opponent.board.getShips().size());
        Ship ship = opponent.board.getShips().get(shipIndex);
        int position = rand.nextInt(ship.getSize());

        ship.hit(position);
        System.out.println("\n🔥 " + name + " ataca el barco " + ship.getName() + " en la posición " + position);

        if (ship.isSunk()) {
            System.out.println("💥 ¡" + ship.getName() + " ha sido hundido!");
            opponent.board.getShips().remove(ship);
        }

        return !opponent.board.getShips().isEmpty();
    }

    public boolean hasShips() {
        return !board.getShips().isEmpty();
    }

    public String getName() {
        return name;
    }

    public void showBoard() {
        board.showBoard(name);
    }
}