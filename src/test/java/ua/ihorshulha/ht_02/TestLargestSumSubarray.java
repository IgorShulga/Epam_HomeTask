package ua.ihorshulha.ht_02;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestLargestSumSubarray {

    private static final int[] NUMS = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    private static final int[] NUMS_EMPTY = {};
    private static final int[] SUB_ARRAY = {4, -1, 2, 1};

    private LargestSumSubarray largestSumSubarray = new LargestSumSubarray();

    @Test
    public void equalsArraysTest() {
        int[] actual = largestSumSubarray.findMaxSubArrayBySum(NUMS);

        Assert.assertArrayEquals(SUB_ARRAY, actual);
    }

    @Test
    public void equalsSumArraysTest() {
        int expected = Arrays.stream(SUB_ARRAY).sum();
        int[] actualArray = largestSumSubarray.findMaxSubArrayBySum(NUMS);
        int actual = Arrays.stream(actualArray).sum();

        Assert.assertEquals(actual, expected);
    }

    @Test(expected = NullPointerException.class)
    public void failArrayIsEmpty() {
        largestSumSubarray.findMaxSubArrayBySum(NUMS_EMPTY);
        largestSumSubarray.findMaxSubArrayBySum(null);
    }
}
