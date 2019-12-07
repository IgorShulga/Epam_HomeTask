package ua.ihorshulha.HT_06;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTwoIndicesAndDifferencesTest {

    private final int k1 = 3;
    private final int k2 = 2;
    private final int[] nums = new int[]{1, 2, 3, 1};
    private final int[] nums2 = new int[]{1, 2, 3, 1, 2, 3};
    private final int[] nums3 = new int[0];

    private final FindTwoIndicesAndDifferences find = new FindTwoIndicesAndDifferences();

    @Test
    public void testTrueFindTwoDistinctWithDifferenceK() {
        assertTrue(find.findTwoDistinctWithDifferenceK(nums, k1));
    }

    @Test
    public void testFalseFindTwoDistinctWithDifferenceK() {
        assertFalse(find.findTwoDistinctWithDifferenceK(nums2, k2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailArrayNull() {
        find.findTwoDistinctWithDifferenceK(null, k2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailArrayLengthZero() {
        find.findTwoDistinctWithDifferenceK(nums3, k2);
    }
}