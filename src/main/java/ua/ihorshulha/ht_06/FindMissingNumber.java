package ua.ihorshulha.ht_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class FindMissingNumber {

    int[] getDuplicatAndMissingNumber(Integer[] array) {

        if(Objects.isNull(array) || array.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int[] result = new int[2];
        Arrays.sort(array);
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : array) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                result[0] = num;
            }
        }
        for (int i = 1; i <= array.length; i++) {
            if (!set.contains(i)) {
                result[1] = i;
            }
        }
        return result;
    }
}