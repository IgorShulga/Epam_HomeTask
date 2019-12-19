package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.AcountController;
import ua.ihorshulha.ht_07.controller.DeveloperController;
import ua.ihorshulha.ht_07.controller.SkillController;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;

import java.io.IOException;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class MainViewer {

    private final SkillController skillController = new SkillController();
    private final DeveloperController devController = new DeveloperController();
    private final AcountController acountController = new AcountController();
    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();

    public void run() throws IOException {
        int numberOfMenu;
        boolean exit = true;
        do {
            Menu.mainMenu();
            String stringTemp = null;
            stringTemp = inputFromKeyboard.input();
            if (isCorrectInteger(stringTemp)) {
                numberOfMenu = Integer.parseInt(stringTemp);
                switch (numberOfMenu) {
                    case 1: {
                        new DevViewer().view(devController);
                        break;
                    }
                    case 2: {
                        new SkillViewer().view(skillController);
                        break;
                    }
                    case 3: {
                        new AccountViewer().view(acountController);
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
        }
        while (exit);
    }
}