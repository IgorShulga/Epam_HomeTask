package ua.ihorshulha.HT_02;

import java.util.Arrays;

public class Task02 {

    static int getArrayLengthWithoutOneValue(int[] array, int val) {
        return (int) Arrays.stream(array).filter(value -> value != val).count();
    }
}
