package ua.ihorshulha.HT_05;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class RemoveDuplicates {

    int getLengthWithoutDuplicates(Integer[] nums) {
        if (Objects.isNull(nums)) {
            throw new IllegalArgumentException("Array must not be null");
        }
        if (nums.length != 0) {
            Set<Integer> set = new HashSet<Integer>();
            Collections.addAll(set, nums);
            return set.size();
        }
        throw new IllegalArgumentException("Array is empty");
    }
}
