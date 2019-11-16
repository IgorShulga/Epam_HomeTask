package ua.ihorshulha.HT_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class testTask04 {

    private static final int[] ARRAY_1 = {1, 2, 9};
    private static final int[] ARRAY_2 = {9, 9, 9};
    private static final int[] ARRAY_3 = {9, 0, 9};

    @Test
    public void testNewArrayPlusOne() {
        int[] expected1 = new int[]{1, 3, 0};
        int[] expected2 = new int[]{1, 0, 0, 0};
        int[] expected3 = new int[]{9, 1, 0};

        assertArrayEquals(expected1, Task04.addOneToArrayAsNumber(ARRAY_1));
        assertArrayEquals(expected2, Task04.addOneToArrayAsNumber(ARRAY_2));
        assertArrayEquals(expected3, Task04.addOneToArrayAsNumber(ARRAY_3));
    }
}