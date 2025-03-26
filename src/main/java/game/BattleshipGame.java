package game;


import Storage.ShipStorage;
import models.ShipBuilder;
import models.ShipType;

import java.util.Scanner;

import java.io.*;
import java.util.*;


public class BattleshipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombres de los jugadores
        System.out.print("👤 Ingrese el nombre del Jugador 1: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("👤 Ingrese el nombre del Jugador 2: ");
        Player player2 = new Player(scanner.nextLine());

        ShipBuilder builder = new ShipBuilder();

        // Crear barcos para cada jugador
        player1.addShip(builder.setType(ShipType.BATTLESHIP).build());
        player1.addShip(builder.setType(ShipType.FRIGATE).build());
        player1.addShip(builder.setType(ShipType.CANOE).build());

        player2.addShip(builder.setType(ShipType.BATTLESHIP).build());
        player2.addShip(builder.setType(ShipType.FRIGATE).build());
        player2.addShip(builder.setType(ShipType.CANOE).build());

        System.out.println("\n🛳️ ¡El juego de " + player1.getName() + " y " + player2.getName() + " ha comenzado! 🛳️");

        // Ciclo del juego
        while (player1.hasShips() && player2.hasShips()) {
            System.out.println("\n🎯 " + player1.getName() + " ataca:");
            player1.attack(player2);
            System.out.println("\n🎯 " + player2.getName() + " ataca:");
            player2.attack(player1);

            // Mostrar tableros actualizados
            System.out.println("\n📊 Estado actual de los tableros:");
            player1.showBoard();
            player2.showBoard();
        }

        // Determinar el ganador
        if (!player1.hasShips() && !player2.hasShips()) {
            System.out.println("\n🤝 ¡EMPATE! Ambos jugadores han perdido todos sus barcos.");
        } else if (!player1.hasShips()) {
            System.out.println("\n🏆 ¡" + player2.getName() + " GANA LA PARTIDA! 🏆");
        } else {
            System.out.println("\n🏆 ¡" + player1.getName() + " GANA LA PARTIDA! 🏆");
        }

        scanner.close();
    }
}