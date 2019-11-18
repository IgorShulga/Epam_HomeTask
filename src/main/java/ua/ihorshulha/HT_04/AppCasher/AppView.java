package ua.ihorshulha.HT_04.AppCasher;

import java.util.Scanner;

public class AppView {

    private double amount;

    public double getAmount() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(isCorrectInteger(input)){
            return Integer.parseInt(input);
        }
        throw new IllegalArgumentException("Please, repeat input");
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
