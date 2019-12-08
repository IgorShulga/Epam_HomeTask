package ua.ihorshulha.ht_06;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindMissingNumberTest {

    private final Integer[] array1 = new Integer[]{1, 3, 4, 5, 5, 6, 2};
    private final Integer[] array2 = new Integer[]{7, 3, 4, 5, 5, 6, 2};
    private final Integer[] array3 = new Integer[]{4, 3, 6, 2, 1, 1};
    private final Integer[] array4 = new Integer[]{2, 1, 2};
    private final Integer[] array5 = new Integer[]{1, 2, 2, 4};
    private final Integer[] array6 = new Integer[]{1, 3, 2, 4};

    FindMissingNumber find = new FindMissingNumber();

    @Test
    public void testSuccessCases() {
        int[] exp1 = new int[]{5, 7};
        int[] exp2 = new int[]{5, 1};
        int[] exp3 = new int[]{1, 5};
        int[] exp4 = new int[]{2, 3};
        int[] exp5 = new int[]{2, 3};
        assertEquals(Arrays.toString(exp1), Arrays.toString(find.getDuplicatAndMissingNumber(array1)));
        assertEquals(Arrays.toString(exp2), Arrays.toString(find.getDuplicatAndMissingNumber(array2)));
        assertEquals(Arrays.toString(exp3), Arrays.toString(find.getDuplicatAndMissingNumber(array3)));
        assertEquals(Arrays.toString(exp4), Arrays.toString(find.getDuplicatAndMissingNumber(array4)));
        assertEquals(Arrays.toString(exp5), Arrays.toString(find.getDuplicatAndMissingNumber(array5)));
    }

    @Test
    public void testWithoutDuplicatAndMissingNumber() {
        int[] exp6 = new int[]{0, 0};
        assertEquals(Arrays.toString(exp6), Arrays.toString(find.getDuplicatAndMissingNumber(array6)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailForArrayNull() {
        find.getDuplicatAndMissingNumber(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailForArrayEmpty() {
        find.getDuplicatAndMissingNumber(new Integer[0]);
    }
}