package ua.ihorshulha.HT_04.AppCasher;

import java.util.Date;

public class BuissnessLogic {

    private final AppView view = new AppView();

    double getDiscount(double amount) {
        double disc = 0.0;
        if (amount == 0 || amount < 0) {
            throw new IllegalArgumentException("Amount must not be 0 or negativ");
        }
        if (amount <= 500.0) {
            disc = 0.05;
        } else if (amount > 500 && amount <= 1000) {
            disc = 0.10;
        } else {
            disc = 0.15;
        }
        return disc;
    }

    Receipt getTotalReciept(double amount) {
        Receipt receipt = new Receipt();
        Date date = new Date();
        double disc = getDiscount(amount);

        receipt.setTotal(amount);
        receipt.setDiscount(disc);
        receipt.setAmountToPay(amount - (amount * disc));
        receipt.setDate(date);
        return receipt;
    }
}
