package ua.ihorshulha.HT_02;

class FindIndexesOfTwoNumbers {

    public int[] getSumTwoElements(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            throw new NullPointerException("Array must not be empty");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("Not elements for this target");
    }
}
