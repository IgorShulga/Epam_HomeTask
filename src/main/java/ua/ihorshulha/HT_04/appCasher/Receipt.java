package ua.ihorshulha.HT_04.appCasher;

import java.util.Date;
import java.util.Objects;

public class Receipt {
    private Date date;
    private double total;
    private double discount;
    private double amountToPay;

    public Date getDate() {
        return date;
    }

    void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Double.compare(receipt.total, total) == 0 &&
                Double.compare(receipt.discount, discount) == 0 &&
                Double.compare(receipt.amountToPay, amountToPay) == 0 &&
                Objects.equals(date, receipt.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, total, discount, amountToPay);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "date = " + date +
                ", total = " + total +
                ", discount = " + discount + "% " +
                ", amountToPay = " + amountToPay +
                '}';
    }
}
