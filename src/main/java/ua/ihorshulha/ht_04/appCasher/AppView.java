package ua.ihorshulha.ht_04.appCasher;

import java.util.Scanner;

class AppView {

    private final BusinessLogic logic = new BusinessLogic();

    Receipt inputAmount() {
        double amount = getAmount();
        return logic.getTotalReceipt(amount);
    }

    private double getAmount() {
        System.out.println("Please, input total amount = ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (isCorrectInteger(input)) {
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

    public void start() {
        System.out.println(inputAmount());
    }
}
