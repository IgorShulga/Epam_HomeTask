package ua.ihorshulha.HT_02;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testTask01 {

    private static final int[] NUMS = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    private static final int[] SUB_ARRAY = {4, -1, 2, 1};

    @Test
    public void equalsArraysTest() {
        int[] actual = Task01.findMaxSubArrayBySum(NUMS);

        Assert.assertArrayEquals(SUB_ARRAY, actual);
    }

    @Test
    public void equalsSumArraysTest() {
        int expected = Arrays.stream(SUB_ARRAY).sum();
        int[] actualArray = Task01.findMaxSubArrayBySum(NUMS);
        int actual = Arrays.stream(actualArray).sum();

        Assert.assertEquals(actual, expected);
    }
}
