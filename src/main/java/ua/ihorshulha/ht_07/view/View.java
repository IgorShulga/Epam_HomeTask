package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.utils.ActionFactory;
import ua.ihorshulha.ht_07.utils.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class View {

    private static final BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
    private ActionFactory actionFactory;

    public void run(){
        int numberOfMenu;
        boolean exit = true;
        do {
            Menu.categories();
            try {
                String stringTemp = inputKeyboard.readLine();
                if (isCorrectInteger(stringTemp)) {
                    numberOfMenu = Integer.parseInt(stringTemp);
                    exit = actionFactory.menuFactory(numberOfMenu, inputKeyboard, exit);
                }
            } catch (IOException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        while (exit);
    }
}
