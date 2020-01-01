package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.AcountController;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;

import java.io.IOException;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class AccountViewer{

    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();

    void view(AcountController controller) throws IOException {
        int num;
        boolean exit = true;
        do {
            Menu.action();
            String input = null;
            input = inputFromKeyboard.input();
            if (isCorrectInteger(input)) {
                num = Integer.parseInt(input);
                switch (num) {
                    case 1: {
//                        List<Skill> allSkills = controller.getAllSkills();
//                        printAllSkills(allSkills);
//                        break;

                        controller.getAllAccounts();
                        break;
                    }
                    case 2: {
                        controller.getAccountById(inputFromKeyboard.input());
                        break;
                    }
                    case 3: {
                        controller.addAccount(inputFromKeyboard.input());
                        break;
                    }
                    case 4: {
                        controller.updateAccountById(inputFromKeyboard.input());
                        break;
                    }
                    case 5: {
                        controller.removeAccountById(inputFromKeyboard.input());
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
        } while (exit);
    }
}

