package game;


import models.Ship;
import java.util.List;

public class BoardBuilder {
    private Board board = new Board();

    public BoardBuilder addShips(List<Ship> ships) {
        for (Ship ship : ships) {
            board.addShip(ship);
        }
        return this;
    }

    public Board build() {
        return board;
    }
}
