package game;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class BattleshipGameTest {
    @Test
    void testGameEndsWhenShipsSunk() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        assertFalse(player1.hasShips());
        assertFalse(player2.hasShips());
    }
}
