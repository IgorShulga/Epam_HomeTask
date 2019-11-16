package ua.ihorshulha.HT_02;

import org.junit.Test;
import static org.junit.Assert.*;

public class testTask02 {

    private static final int[] ARRAY = {0, 1, 2, 2, 3, 0, 4, 2};
    private static final int VAL = 2;

    @Test
    public void testEqualsLength() {
        int expected = Task02.getArrayLengthWithoutOneValue(ARRAY, VAL);
        assertEquals(expected,5);
    }

}