package ua.ihorshulha.ht_04;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.ihorshulha.ht_04.CommonSubString.getSubString;

public class CommonSubStringTest {

    @Test
    public void testSuccessGetCommonSubstring() {
        String str1 = "balab";
        String str2 = "swlab";
        String actual = getSubString(str1, str2);
        String expected = "lab";
        assertEquals(expected, actual);
    }

    @Test
    public void testNotExistGetCommonSubstring() {
        String str1 = "qwert";
        String str2 = "asdfg";
        String actual = getSubString(str1, str2);
        String expected = "Common substring not exist";
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailStringEmpty() {
        String str1 = "";
        String str2 = "swlab";
        getSubString(str1, str2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailStringNull() {
        String str1 = null;
        String str2 = "swlab";
        getSubString(str1, str2);
    }
}