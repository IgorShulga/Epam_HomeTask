package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.DeveloperController;
import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;

import java.io.IOException;
import java.util.List;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class DevViewer{

    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();

    void view(DeveloperController controller) throws IOException {
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
                        List<Developer> allDevelopers = controller.getAllDevelopers();
                        printAllDevelopers(allDevelopers);
                        break;
                    }
                    case 2: {
                        Developer dev = controller.getDeveloperById();
                        printOneDeveloper(dev);
                        break;
                    }
                    case 3: {
                        controller.addDeveloper();
                        break;
                    }
                    case 4: {
                        System.out.println("Input developer Id for update - ");
                        String inputId = inputFromKeyboard.input();
                        controller.updateDeveloperById(inputId);
                        break;
                    }
                    case 5: {
                        System.out.println("Input developer Id for delete - ");
                        String inputId = inputFromKeyboard.input();
                        controller.removeDeveloperById(inputId);
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

    private void printOneDeveloper(Developer dev) {
        System.out.println(dev.toString());
    }

    private void printAllDevelopers(List<Developer> allDevelopers) {
        System.out.println("List of developers: ");
        allDevelopers.stream().forEach(System.out::println);
    }
}
