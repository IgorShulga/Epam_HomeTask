package ua.ihorshulha.ht_07.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ua.ihorshulha.ht_07.utils.Constants.INPUT_ID;
import static ua.ihorshulha.ht_07.utils.Validate.isCorrectLong;

public class InputFromKeyboard {

    public String input() throws IOException {
        String string = "";
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            string = bufr.readLine();
        return string;
    }

    public long isCorrectInput(String input) {
        boolean correct;
        System.out.println(INPUT_ID);
        long id = -1;
        String str = null;
        do {
            str = input;
            correct = isCorrectLong(str);
        } while (!correct);
        return Long.parseLong(str);
    }
}
