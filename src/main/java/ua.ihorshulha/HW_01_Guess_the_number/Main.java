package ua.ihorshulha.HW_01_Guess_the_number;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        int random = generator.nextInt(1000) + 1;

        System.out.println("My app is thinking of a number between 0 and 1000.");
        System.out.println("Guess it! Input integer, please...");
        do {
            String str = scanner.next();
            if (isCorrectInteger(str)) {
                input = Integer.parseInt(str);

                if (input < 0 || input > 1000) {
                    System.out.println("Number between 0 and 1000...");
                }
                if (input > random) {
                    System.out.println("Less!");
                } else if (input < random) {
                    System.out.println("More!");
                }
            }
        }
        while (input != random);

        System.out.print(random + "is the correct answer and it took you");
    }


    private static boolean isCorrectInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Enter only number");
            return false;
        }
        return true;
    }
}
