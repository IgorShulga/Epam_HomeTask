package ua.ihorshulha.HT_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class testTask03 {

    private static final int[] ARRAY = {2, 7, 11, 15};
    private static final int TARGET = 9;

    @Test
    public void testEqualsSum() {
        int[] expected = {0, 1};
        int[] actual = Task03.getSumTwoElements(ARRAY, TARGET);
        assertArrayEquals(actual, expected);
    }
}