package ua.ihorshulha.HT_04.AppCasher;

import java.util.Scanner;

public class AppView {

    private final BuissnessLogic logic = new BuissnessLogic();

    Receipt inputAmount(){
        double amount = getAmount();
        return logic.getTotalReciept(amount);
    }

    private double getAmount() {
        System.out.println("Please, input total amount = ");
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
