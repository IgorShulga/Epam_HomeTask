package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.utils.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class MainView {

    private static final BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));

    public void run() {
        int numberOfMenu;
        boolean exit = true;
        do {
            Menu.mainMenu();
            String stringTemp = null;
            try {
                stringTemp = inputKeyboard.readLine();
                if (isCorrectInteger(stringTemp)) {
                    numberOfMenu = Integer.parseInt(stringTemp);
                    switch (numberOfMenu) {
                        case 1: {
                            new DevViewer().devView(inputKeyboard);
                            break;
                        }
                        case 2: {
                            new SkillViewer().skillView(inputKeyboard);
                            break;
                        }
                        case 3: {
                            new AccountViewer().accountView(inputKeyboard);
                            break;
                        }
                        case 0: {
                            System.out.println("Good bay");
                            exit = false;
                            break;
                        }
                        default: {
                            System.out.println("You entered invalid number. Repeat please.");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (exit);
    }
}