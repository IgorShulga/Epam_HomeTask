package ua.ihorshulha.ht_09.creational.builder;

public class CryptoWallet {
    private String name;
    private Currency currency;
    private int balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CryptoWallet{" +
                "name='" + name + '\'' +
                ", currency=" + currency +
                ", balance=" + balance +
                '}';
    }
}
