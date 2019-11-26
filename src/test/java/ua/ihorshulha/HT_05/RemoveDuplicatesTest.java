package ua.ihorshulha.HT_05;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void testSuccessGetNewLength() {
        int expected = 5;
        Integer[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int actual = removeDuplicates.getLengthWithoutDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSuccessGetNewLength2() {
        int expected = 10;
        Integer[] nums = {0, 9, 7, 8, 1, 3, 2, 5, 6, 4};
        int actual = removeDuplicates.getLengthWithoutDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailArrayNull() {
        Integer[] nums = null;
        removeDuplicates.getLengthWithoutDuplicates(nums);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailLengthZero() {
        Integer[] nums = {};
        removeDuplicates.getLengthWithoutDuplicates(nums);
    }
}