package ua.ihorshulha.ht_07.utils;

public class Validate {

    public static boolean isCorrectInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(Constants.DATA_TYPE_IS_NOT_NUMBER);
            return false;
        }
        return true;
    }

    public static boolean isCorrectLong(String str) {
        try {
            Long.parseLong(str);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(Constants.DATA_TYPE_IS_NOT_NUMBER);
            return false;
        }
        return true;
    }
}
