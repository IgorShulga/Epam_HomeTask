package ua.ihorshulha.HT_02;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task05 {

    static boolean findDublicates(int[] array) {
        Set<Integer> set = new HashSet<>();
//        Other way convert array to set, but only fo Integer
//        Collections.addAll(set, array);
        for (int value : array) {
            set.add(value);
        }
        return set.size() != array.length;
    }
}
