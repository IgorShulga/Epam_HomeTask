package ua.ihorshulha.HT_06;

import org.junit.Test;

import static org.junit.Assert.*;

public class SplitCandyTest {

    private final Integer[] candy = new Integer[]{1, 1, 2, 2, 3, 3, 4, 4, 7, 7, 7, 7};
    private final Integer[] candy2 = new Integer[]{1, 1, 2, 2, 3, 3};
    private final Integer[] candy3 = new Integer[]{1, 1, 2, 3};
    private final Integer[] candy4 = new Integer[0];

    private final SplitCandy candys = new SplitCandy();

    @Test
    public void testGetAmountCandyOfSister() {
        assertEquals(5, candys.getAmountCandyOfSister(candy));
        assertEquals(3, candys.getAmountCandyOfSister(candy2));
        assertEquals(2, candys.getAmountCandyOfSister(candy3));
    }

    @Test
    public void testArrayEmpty() {
        assertEquals(0, candys.getAmountCandyOfSister(candy4));
    }

    @Test
    public void testArrayNull() {
        assertEquals(0, candys.getAmountCandyOfSister(null));
    }
}