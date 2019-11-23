package ua.ihorshulha.HT_04;

public class CommonSubString {

    public static String getSubString(String str1, String str2) {

        String subString;
        int maxLength = 0;

        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty!");
        }

        int[][] dp = new int[str1.length()][str2.length()];
        int end = -1;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if (maxLength < dp[i][j]) {
                        maxLength = dp[i][j];
                        end = i;
                    }
                }
            }
        }
        subString = str1.substring(end - maxLength + 1, end + 1);

        if (subString.length() == 0) {
            subString = "Common substring not exist";
        }
        return subString;
    }
}
