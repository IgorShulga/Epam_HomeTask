package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.DeveloperController;
import ua.ihorshulha.ht_07.utils.Menu;

import java.io.BufferedReader;
import java.io.IOException;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class DevViewer{

    void view(BufferedReader inputKeyboard, DeveloperController controller) {
        int num;
        boolean exit = true;
        do {
            Menu.action(inputKeyboard);
            String input = null;
            try {
                input = inputKeyboard.readLine();
                if (isCorrectInteger(input)) {
                    num = Integer.parseInt(input);
                    switch (num) {
                        case 1: {
                            controller.getAllDevelopers();
                            break;
                        }
                        case 2: {
                            controller.getDeveloperById(inputKeyboard);
                            break;
                        }
                        case 3: {
                            controller.addDeveloper(inputKeyboard);
                            break;
                        }
                        case 4: {
                            controller.updateDeveloperById(inputKeyboard);
                            break;
                        }
                        case 5: {
                            controller.removeDeveloperById(inputKeyboard);
                            break;
                        }
                        case 0: {
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
        } while (exit);
    }
}
