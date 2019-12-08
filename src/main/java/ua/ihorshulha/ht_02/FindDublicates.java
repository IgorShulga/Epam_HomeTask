package ua.ihorshulha.ht_02;

import java.util.HashSet;
import java.util.Set;

public class FindDublicates {

    public boolean isHaveDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        if (array != null) {
//        Other way convert array to set, but only fo Integer
//        Collections.addAll(set, array);
            for (int value : array) {
                set.add(value);
            }
            return set.size() != array.length;
        }
        throw new NullPointerException("Array is empty!");
    }
}
