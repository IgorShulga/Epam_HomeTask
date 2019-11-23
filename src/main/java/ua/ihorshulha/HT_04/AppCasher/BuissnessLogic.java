package ua.ihorshulha.HT_04.AppCasher;

import java.util.Date;

public class BuissnessLogic {

    private double getDiscount(double amount) {
        double disc;
        if (amount == 0 || amount < 0) {
            throw new IllegalArgumentException("Amount must not be 0 or negative");
        }
        if (amount <= 500.0) {
            disc = 5.0;
        } else if (amount > 500 && amount <= 1000) {
            disc = 10.0;
        } else {
            disc = 15.0;
        }
        return disc;
    }

    Receipt getTotalReciept(double amount) {
        Receipt receipt = new Receipt();
        Date date = new Date();
        double disc = getDiscount(amount);

        receipt.setTotal(amount);
        receipt.setDiscount(disc);
        receipt.setAmountToPay(amount - (amount * (100/disc)));
        receipt.setDate(date);
        return receipt;
    }
}
