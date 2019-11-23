package ua.ihorshulha.LeetCode;

public class IntRevers {

    private static int reverseInt(int num) {
        int reversedNum = 0;
        int input = num;

        while (input != 0) {
            reversedNum = reversedNum * 10 + input % 10;
            input = input / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            return 0;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        System.out.println(reverseInt(-987));
    }
}
