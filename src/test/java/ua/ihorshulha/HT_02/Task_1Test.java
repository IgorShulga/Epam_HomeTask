package ua.ihorshulha.HT_02;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Task_1Test extends Task_1 {

    private static final int[] NUMS = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    private static final int[] SUB_ARRAY = {4, -1, 2, 1};

    @Test
    public void equalsArraysTest() {
        int[] actual = findMaxSubArrayBySum(NUMS);

        assertArrayEquals(SUB_ARRAY, actual);
    }

    @Test
    public void equalsSumArraysTest() {
        int expected = Arrays.stream(SUB_ARRAY).sum();
        int[] actualArray = findMaxSubArrayBySum(NUMS);
        int actual = Arrays.stream(actualArray).sum();

        assertEquals(actual, expected);
    }
}