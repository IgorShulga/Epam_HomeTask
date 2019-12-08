package ua.ihorshulha.ht_05;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortedArrayToBSTTest {

    @Test
    public void testGetBstFromSortedArray() {
        SortedArrayToBST getBST = new SortedArrayToBST();
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Integer[] arrayExp = {6, 2, 0, 1, 4, 3, 5, 9, 7, 8, 11, 10, 12};
        List<Integer> expected = Arrays.asList(arrayExp);
        TreeNode bstFromSortedArray = getBST.getBstFromSortedArray(array, 0, array.length - 1);
        List<Integer> actual = getBST.preOrder(bstFromSortedArray);

        assertEquals(expected, actual);
    }
}