package ua.ihorshulha.ht_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFindIndexesOfTwoNumbers {

    private static final int[] ARRAY = {2, 7, 11, 15, 2};
    private static final int TARGET = 4;
    private static final int TARGET_FALSE = 3;

    private FindIndexesOfTwoNumbers find = new FindIndexesOfTwoNumbers();

    @Test
    public void testHaveElementsForTarget() {
        int[] expected = {0, 4};
        int[] actual = find.getSumTwoElements(ARRAY, TARGET);
        assertArrayEquals(actual, expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDontHaveElementsForTarget() {
        find.getSumTwoElements(ARRAY, TARGET_FALSE);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayIsNull() {
        find.getSumTwoElements(null, TARGET);
    }
}