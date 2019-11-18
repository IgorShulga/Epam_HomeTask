package ua.ihorshulha.HT_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFindDublicates {
    private static final int[]ARRAY1 = {1,2,3,1};
    private static final int[]ARRAY2 = {1,2,3,4};
    private static final int[]ARRAY3 = {1,1,1,3,3,4,3,2,4,2};
    private static final int[] ARRAY_EMPTY = {};

    private FindDublicates findDublicates = new FindDublicates();

    @Test
    public void testTrueContainsDublicates() {
        assertTrue(findDublicates.isHaveDuplicates(ARRAY1));
        assertTrue(findDublicates.isHaveDuplicates(ARRAY3));
    }

    @Test
    public void testFalseContainsDublicates() {
        assertFalse(findDublicates.isHaveDuplicates(ARRAY2));
    }

    @Test(expected = NullPointerException.class)
    public void testFailArrayIsEmptyOrNull() {
        findDublicates.isHaveDuplicates(ARRAY_EMPTY);
        findDublicates.isHaveDuplicates(null);
    }
}