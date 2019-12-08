package ua.ihorshulha.ht_02;

import java.util.Arrays;

public class NewLengthArray {

    int getArrayLengthWithoutOneValue(int[] array, int val) {
        if(array == null || array.length == 0){
            throw new NullPointerException("Array is empty!");
        }
        return (int) Arrays.stream(array).filter(value -> value != val).count();
    }
}
