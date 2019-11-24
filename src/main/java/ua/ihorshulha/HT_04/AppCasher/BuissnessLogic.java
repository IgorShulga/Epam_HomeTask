package ua.ihorshulha.HT_04.AppCasher;

import java.util.Date;

public class BuissnessLogic {

    double getDiscount(double amount) {
        double disc;
        checkAmountIsCorrect(amount);
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
        checkAmountIsCorrect(amount);
        Receipt receipt = new Receipt();
        Date date = new Date();
        double disc = getDiscount(amount);

        receipt.setTotal(amount);
        receipt.setDiscount(disc);
        receipt.setAmountToPay(amount - (amount * (disc / 100)));
        receipt.setDate(date);
        return receipt;
    }

    private void checkAmountIsCorrect(double amount) {
        if (amount == 0 || amount < 0 || Double.isNaN(amount)) {
            throw new IllegalArgumentException("Amount must not be 0, char or negative");
        }
    }
}
