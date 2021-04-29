import Menus.*;

public class Game {
    private static boolean verb = true;

    public static void main(String[] args) {
        System.out.println("Running: Game.java");
        System.out.println();

        if (verb && args.length > 0) {
            switch(args[0].toString()) {
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

    private static void testMainMenu() {
        Menus.Main.displayMainMenu();
    }

    private static void testInventory() {
    }

    private static void testCombat() {
    }
}
