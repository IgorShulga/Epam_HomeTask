package ua.ihorshulha.ht_09.creational.prototype;

import ua.ihorshulha.ht_09.creational.builder.Currency;

public class Tx implements Copyable{
    private int id;
    private Currency currency;
    private String amountTx;
    private String state;

    public Tx(int id, Currency currency, String amountTx, String state) {
        this.id = id;
        this.currency = currency;
        this.amountTx = amountTx;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getAmountTx() {
        return amountTx;
    }

    public void setAmountTx(String amountTx) {
        this.amountTx = amountTx;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Object copy() {
        Tx copy = new Tx(id, currency, amountTx, state);
        return copy;
    }

    @Override
    public String toString() {
        return "Tx{" +
                "id=" + id +
                ", currency=" + currency +
                ", amountTx='" + amountTx + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
