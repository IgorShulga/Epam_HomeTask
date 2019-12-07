package ua.ihorshulha.HT_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class FindDuplicatesInArray {

    boolean hasDuplicates(Integer[] array) {

        if (Objects.isNull(array) || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int sizeArray = array.length;
        int sizeSet = new HashSet<>(Arrays.asList(array)).size();

        return sizeSet < sizeArray;
    }
}
