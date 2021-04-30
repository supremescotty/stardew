package Menus;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    private String[] commands = new String[] {
            "new game", "continue", "help", "exit"
    };

    public static void displayMainMenu(String error) throws IOException, InterruptedException {
        System.out.println(error);
        System.out.println();

        displayMainMenu();
    }

    public static void displayMainMenu() throws IOException, InterruptedException {

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

    private static void NewGame() throws IOException, InterruptedException {
        clearScreen();
    }

    private static void Continue() throws IOException, InterruptedException {
        clearScreen();
    }

    private static void Help() throws IOException, InterruptedException {
        clearScreen();
    }

    private static void Exit() throws IOException, InterruptedException {
        System.out.println();
        System.out.println("Are you sure you would like to exit? Y or N");

        if (input.nextLine().charAt(0) == 'y') {
            System.exit(0);
        }

        displayMainMenu();
    }

    public static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
