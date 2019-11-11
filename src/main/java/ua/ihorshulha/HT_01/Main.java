package ua.ihorshulha.HT_01;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input = 0;
        int count;
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        int random = generator.nextInt(1000) + 1;

        System.out.println("My app is thinking of a number between 0 and 1000.");
        System.out.println("Guess it! Input integer, please...");
        count = 1;
        do {
            String str = scanner.next();
            if (isCorrectInteger(str)) {
                input = Integer.parseInt(str);

                if (input < 0 || input > 1000) {
                    System.out.println("Number between 0 and 1000... Try again");
                    count++;
                }
                if (input > random) {
                    System.out.println("Too high! Try again");
                    count++;
                } else if (input < random) {
                    System.out.println("Too low! Try again");
                    count++;
                }
            }
        }
        while (input != random);

        System.out.print(random + " - You guessed for " + count + " times");
    }


    private static boolean isCorrectInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Enter only number. Try again.");
            return false;
        }
        return true;
    }
}

