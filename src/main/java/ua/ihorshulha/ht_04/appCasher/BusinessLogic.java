package ua.ihorshulha.ht_04.appCasher;

import java.util.Date;

class BusinessLogic {

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

    Receipt getTotalReceipt(double amount) {
        checkAmountIsCorrect(amount);
        Receipt receipt = new Receipt();
        Date date = new Date();
        double disc = getDiscount(amount);
        double finalAmount = getFinalAmount(amount, disc);

        receipt.setTotal(amount);
        receipt.setDiscount(disc);
        receipt.setAmountToPay(finalAmount);
        receipt.setDate(date);
        return receipt;
    }

    private double getFinalAmount(double amount, double disc) {
        return amount - (amount * (disc / 100));
    }

    private void checkAmountIsCorrect(double amount) {
        if (amount == 0 || amount < 0 || Double.isNaN(amount)) {
            throw new IllegalArgumentException("Amount must not be 0, char or negative");
        }
    }
}
