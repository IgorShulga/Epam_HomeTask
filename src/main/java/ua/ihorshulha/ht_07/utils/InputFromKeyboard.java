package ua.ihorshulha.ht_07.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromKeyboard {

    public static String input() {
        String string = "";
        try(BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in))) {
            string = bufr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }
}
