package ua.ihorshulha.ht_07.utils;

import ua.ihorshulha.ht_07.exception.ApplicationException;

import java.util.Objects;

public class Validate {

    public static boolean isCorrectInteger(String str) {
        try {
            if (Objects.isNull(str) || str.isEmpty()) {
                throw new ApplicationException("Must don't be empty or null");
            }
            Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException | ApplicationException e) {
            System.out.println(Constants.DATA_TYPE_IS_NOT_NUMBER);
            return false;
        }
        return true;
    }

    public static boolean isCorrectLong(String str) {
        try {
            if (Objects.isNull(str) || str.isEmpty()) {
                throw new ApplicationException("Must don't be empty or null");
            }
            Long.parseLong(str);
        } catch (NumberFormatException | NullPointerException | ApplicationException e) {
            System.out.println(Constants.DATA_TYPE_IS_NOT_NUMBER);
            return false;
        }
        return true;
    }
}
