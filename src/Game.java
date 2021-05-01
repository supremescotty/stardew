import ItemSystem.InventorySlot;
import ItemsOld.AnimalProduct;
import ItemsOld.Item;
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
        ItemSystem.Inventory inventory = new ItemSystem.Inventory(new NPC());
        inventory.addToInventory(new AnimalProduct());
        InventorySlot[] slots = inventory.getInventory();

        for (ItemSlot itemSlot : slots) {
            if (itemSlot != null && itemSlot.getItem() != null) {
                System.out.println(itemSlot.getItem());
            }
        }
    }

    private static void testCombat() {
    }
}
