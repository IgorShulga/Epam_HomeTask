package ua.ihorshulha.HT_02;

import java.util.Objects;

public class Task04 {

    static int[] addOneToArrayAsNumber(int[] array) {

        int newLength = array.length;
        StringBuilder str = new StringBuilder();

        int count = 0;
        for (int value : array) {
            if (value == 9) {
                count++;
            }
            String s = Objects.toString(value);
            str.append(s);
        }

        if (count == array.length) {
            newLength = count + 1;
        }

        int[]result = new int[newLength];
        int numPlusOne = Integer.parseInt(str.toString()) + 1;

        String[] nums = String.valueOf(numPlusOne).split("");

        for (int i = 0; i < newLength; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}
