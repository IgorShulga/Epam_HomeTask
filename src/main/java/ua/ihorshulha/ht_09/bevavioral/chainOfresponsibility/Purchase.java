package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class Purchase {
    private int Number;
    private double Amount;
    private String name;

    public Purchase(int number, double amount, String name) {
        Number = number;
        Amount = amount;
        this.name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public double getAmount() {
        return Amount;
    }
}
