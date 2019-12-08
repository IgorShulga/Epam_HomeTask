package ua.ihorshulha.ht_06;

import java.util.Objects;

public class FindTwoIndicesAndDifferences {

    boolean findTwoDistinctWithDifferenceK(int[] nums, int k) {

        if (Objects.isNull(nums) || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (Math.abs(i - j) == k)) {
                    return true;
                }
            }
        }
        return false;
    }
}