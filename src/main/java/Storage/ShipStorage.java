package Storage;


import models.Ship;
import java.io.*;
import java.util.List;

public class ShipStorage {
    private static final String FILE_NAME = "ships.txt";

    public static void saveShips(List<Ship> ships) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Ship ship : ships) {
                writer.write(ship.getName() + "\n");
            }
            System.out.println("✅ Barcos guardados en " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar barcos: " + e.getMessage());
        }
    }
}
