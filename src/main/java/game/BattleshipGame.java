package game;


import models.ShipBuilder;

import java.util.Scanner;

public class BattleshipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del Jugador 1:");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Ingrese nombre del Jugador 2:");
        Player player2 = new Player(scanner.nextLine());

        ShipBuilder builder = new ShipBuilder();
        player1.addShip(builder.setSize(5).setName("Battleship").build());
        player1.addShip(builder.setSize(3).setName("Frigate").build());
        player1.addShip(builder.setSize(1).setName("Canoe").build());

        player2.addShip(builder.setSize(5).setName("Battleship").build());
        player2.addShip(builder.setSize(3).setName("Frigate").build());
        player2.addShip(builder.setSize(1).setName("Canoe").build());

        while (player1.hasShips() && player2.hasShips()) {
            boolean p1Attack = player1.attack(player2);
            boolean p2Attack = player2.attack(player1);

            if (!p1Attack && !p2Attack) {
                System.out.println("Empate. Ambos jugadores han perdido todos sus barcos.");
                break;
            } else if (!p1Attack) {
                System.out.println(player2.getName() + " gana.");
                break;
            } else if (!p2Attack) {
                System.out.println(player1.getName() + " gana.");
                break;
            }
        }
        scanner.close();
    }
}
