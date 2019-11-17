package ua.ihorshulha.HT_03;

import java.util.Scanner;

class CommandLine {

    private static void showMenu() {
        System.out.println("Input 1 -> Rock ");
        System.out.println("Input 2 -> Paper ");
        System.out.println("Input 3 -> Scissors");
        System.out.println("if you want EXIT -> input 0 ");
    }

    static void run(Scanner scanner) {
        System.out.println("Hello! Lets start Game! ");
        int numberOfMenu;
        Choice choice = null;
        boolean exit = true;
        do {
            showMenu();
            System.out.println("Choose one... ");
            String stringTemp = scanner.next();
            if (isCorrectInteger(stringTemp)) {
                numberOfMenu = Integer.parseInt(stringTemp);
                switch (numberOfMenu) {
                    case 1: {
                        choice = Choice.ROCK;
                        break;
                    }
                    case 2: {
                        choice = Choice.PAPER;
                        break;
                    }
                    case 3: {
                        choice = Choice.SCISSORS;
                        break;
                    }
                    case 0: {
                        System.out.println("Goodbye! ");
                        exit = false;
                        break;
                    }
                    default: {
                        System.out.println("You entered invalid number. Repeat please.");
                        break;
                    }
                }
            }
            GameLogic game = new GameLogic(choice);
            if (choice != null) {
                System.out.println("You chose -> " + game.getUserChoice());
                System.out.println("Computer chose -> " + game.getCompChoice());
                System.out.println("The WINNER => " + game.getResult() + "  Congratulations!!!");
            }
            exit = isLetsAgain(exit, scanner);
        }
        while (exit);
    }

    private static boolean isLetsAgain(boolean exit, Scanner scanner) {
        if (!exit) {
            return exit;
        }
        System.out.println("Input (1) - try again \nInput (0) for exit");
        String stringTemp = scanner.next();
        if (isCorrectInteger(stringTemp)) {
            int menu = Integer.parseInt(stringTemp);
            if (menu == 0) {
                System.out.println("Goodbye! ");
                exit = false;
            }
        }
        return exit;
    }

    private static boolean isCorrectInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("This is not number");
            return false;
        }
        return true;
    }
}
