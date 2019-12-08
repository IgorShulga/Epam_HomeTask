package ua.ihorshulha.ht_02;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestNewLengthArray {

    private static final int[] ARRAY = {0, 1, 2, 2, 3, 0, 4, 2};
    private static final int[] ARRAY_EMPTY = {};
    private static final int VAL = 2;
    private static final int VAL2 = 9;

    private NewLengthArray newLengthArray = new NewLengthArray();

    @Test
    public void testEqualsLength() {
        int expected = newLengthArray.getArrayLengthWithoutOneValue(ARRAY, VAL);
        assertEquals(expected,5);
    }

    @Test
    public void testLengthDontChange() {
        int expected = newLengthArray.getArrayLengthWithoutOneValue(ARRAY, VAL2);
        assertEquals(expected,ARRAY.length);
    }

    @Test(expected = NullPointerException.class)
    public void testFailArrayIsEmpty() {
        newLengthArray.getArrayLengthWithoutOneValue(ARRAY_EMPTY, VAL2);
        newLengthArray.getArrayLengthWithoutOneValue(null, VAL2);
    }

}