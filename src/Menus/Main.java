package Menus;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    private String[] commands = new String[] {
            "new game", "continue", "help", "exit"
    };

    public static void displayMainMenu(String error) {
        System.out.println(error);
        System.out.println();
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1. New Game");
        System.out.println("2. Continue");
        System.out.println("3. Help");
        System.out.println("4. Exit");

        try {
            int newInput = Integer.parseInt(input.nextLine().strip());

            switch (newInput) {
                case 1: NewGame(); break;
                case 2: Continue(); break;
                case 3: Help(); break;
                case 4: Exit(); break;

                default:
                    displayMainMenu("Input not accepted, please try again:");
            }
        } catch (Exception e) {
            displayMainMenu("Please enter a number 1-4:");
        }
    }

    private static void NewGame() {

    }

    private static void Continue() {

    }

    private static void Help() {

    }

    private static void Exit() {
        System.out.println();
        System.out.println("Are you sure you would like to exit? Y or N");
        if (input.nextLine().charAt(0) == 'y') {

        }
    }
}
