package ua.ihorshulha.HT_02;

import java.util.Arrays;

class Task_1 {

    int[] findMaxSubArrayBySum(int[] nums) {
        int result = nums[0];
        int resultStart = 0;
        int resultEnd = 0;
        int currentSum = 0;
        int currentStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            if (currentSum < 0) {
                currentSum = 0;
                currentStart = i + 1;
            } else if (currentSum > result) {
                result = currentSum;
                resultStart = currentStart;
                resultEnd = i;
            }
        }
        return Arrays.copyOfRange(nums, resultStart, resultEnd + 1);
    }
}
