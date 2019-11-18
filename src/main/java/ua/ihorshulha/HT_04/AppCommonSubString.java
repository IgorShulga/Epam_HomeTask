package ua.ihorshulha.HT_04;

import java.util.HashSet;
import java.util.Set;

public class AppCommonSubString {


    public static void main(String[] args) {
        String str1 = "ablab";
        String str2 = "sklab";
        commonSubString(str1, str2);
    }

    private static String commonSubString(String str1, String str2) {
        String subString = null;
        if (str1.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty!");
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == -1 || arr2[j] == -1){
                    return "";
                }
                if (arr1[i] == arr2[j]) {
                    if (arr1[i + 1] == arr2[j + 1]);
                }

//arr1.equals()
            }
        }
        return null;
    }

    public static Set<String> longestCommonSubstrings(String s, String t) {
        int[][] table = new int[s.length()][t.length()];
        int longest = 0;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    continue;
                }

                table[i][j] = (i == 0 || j == 0) ? 1 : 1 + table[i - 1][j - 1];

                if (table[i][j] > longest) {
                    longest = table[i][j];
                    result.clear();
                }
                if (table[i][j] == longest) {
                    result.add(s.substring(i - longest + 1, i + 1));
                }
            }
        }
        return result;
    }


}
