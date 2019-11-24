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


}