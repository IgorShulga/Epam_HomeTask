package ua.ihorshulha.ht_01;

import java.util.Random;
import java.util.Scanner;

public class App_Guess_Number {

    private static final String START_GAME = "My app is thinking of a number between 0 and 1000. \n " +
            "Guess it! Input integer, please... ";
    private static final String TRY_AGAIN = "Try again ";
    private static final String REMINDER = "Number between 0 and 1000... ";
    private static final String TOO_HIGH = "Too high! ";
    private static final String TOO_LOW = "Too low! ";
    private static final String NOT_NUMBER = "Enter only number. ";
    private static final String WIN = " - You guessed for ";
    private static final String TIMES = " times";


    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        int input = 0;
        int count;
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int random = generator.nextInt(1000) + 1;
        System.out.println(START_GAME);
        count = 1;
        do {
            String str = scanner.next();
            if (isCorrectInteger(str)) {
                input = Integer.parseInt(str);

                if (input < 0 || input > 1000) {
                    System.out.println(REMINDER + TRY_AGAIN);
                    count++;
                }
                if (input > random) {
                    System.out.println(TOO_HIGH + TRY_AGAIN);
                    count++;
                } else if (input < random) {
                    System.out.println(TOO_LOW + TRY_AGAIN);
                    count++;
                }
            }
        }
        while (input != random);

        System.out.print(random + WIN + count + TIMES);
    }

    private static boolean isCorrectInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(NOT_NUMBER + TRY_AGAIN);
            return false;
        }
        return true;
    }
}

