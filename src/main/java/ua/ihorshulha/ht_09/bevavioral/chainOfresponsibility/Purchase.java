package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class Purchase {
    private int number;
    private double amount;
    private String name;

    Purchase(int number, double amount, String name) {
        this.number = number;
        this.amount = amount;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    double getAmount() {
        return amount;
    }
}
