import ItemSystem.Entities.Tools.Axe;
import ItemSystem.Entities.Tools.*;
import ItemSystem.Entities.Weapons.Sword;
import ItemSystem.InventorySlot;
import Menus.*;
import Players.*;

import java.io.IOException;

public class Game {
    private static boolean verb = true;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Running: Game.java");
        System.out.println();

        if (verb && args.length > 0) {
            switch(args[0]) {
                case "Combat":      testCombat();       break;
                case "Inventory":   testInventory();    break;
                case "MainMenu":    testMainMenu();     break;
                case "Farming":     testFarming();      break;
                case "Fishing":     testFishing();      break;
                case "Travel":      testTravelling();   break;
                case "NPC":         testNpc();          break;

                default: break;
            }
        }
    }

    private static void testNpc() {
    }

    private static void testTravelling() {
    }

    private static void testFishing() {
    }

    private static void testFarming() {
    }

    private static void testMainMenu() throws IOException, InterruptedException {
        Menus.Main.displayMainMenu();
    }

    private static void testInventory() {
        Self self = new Self();
        printInventory(self);
        System.out.println();
        self.getInventory().sort();
        printInventory(self);
    }

    private static void printInventory(Player player) {
        for (InventorySlot slot : player.getInventory().getInventory()) {
            if (slot != null) {
                System.out.println(slot.getEntity().getName() + " #: " + slot.getEntity().getNumberOfEntities());
            }
        }
    }

    private static void testCombat() {
    }
}
