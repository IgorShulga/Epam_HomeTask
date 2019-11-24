package ua.ihorshulha.HT_04.AppCasher;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class BuissnessLogicTest {

    private final BuissnessLogic logic = new BuissnessLogic();
    private final Date date = new Date();

    @Test
    public void testSuccessDiscount() {
        int amount = 1000;
        double expected = 10.0;
        double actual = logic.getDiscount(amount);
        assertEquals(expected, actual, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountZero() {
        int amount = 0;
        logic.getDiscount(amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountNegative() {
        int amount = -2000;
        logic.getDiscount(amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountIsNaN() {
        int amount = Integer.parseInt("www");
        logic.getDiscount(amount);
    }

    @Test
    public void testGetTotalReciept() {
        Receipt actual = logic.getTotalReciept(1000);
        actual.setDate(date);

        Receipt expected = new Receipt();
        expected.setTotal(1000);
        expected.setDiscount(10.0);
        expected.setAmountToPay(900);
        expected.setDate(date);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountZero2() {
        int amount = 0;
        logic.getTotalReciept(amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountNegative2() {
        int amount = -3300;
        logic.getTotalReciept(amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountIsNaN2() {
        int amount = Integer.parseInt("w3w");
        logic.getTotalReciept(amount);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFailAmountNull() {
        double amount = Integer.parseInt(null);
        logic.getTotalReciept(amount);
    }
}