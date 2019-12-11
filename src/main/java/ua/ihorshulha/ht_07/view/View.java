package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.SkillController;
import ua.ihorshulha.ht_07.utils.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class View {

    private static final BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
    private SkillController skillController = new SkillController();

    public void run(){
        int numberOfMenu;
        boolean exit = true;
        do {
            Menu.categories();

            try {
                String stringTemp = inputKeyboard.readLine();
                if (isCorrectInteger(stringTemp)) {
                    numberOfMenu = Integer.parseInt(stringTemp);
                    switch (numberOfMenu) {
                        case 1: {
                            System.out.println("soon");
//                            developerController(inputKeyboard);
                            break;
                        }
                        case 2: {
                            skillController.work(inputKeyboard);
                            break;
                        }
                        case 3: {
                            System.out.println("soon");
//                            acountController(inputKeyboard);
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
                System.out.println("Exception: " + e.getMessage());
            }
        }
        while (exit);
    }
}
