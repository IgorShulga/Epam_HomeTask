package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.SkillController;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;
import ua.ihorshulha.ht_07.utils.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class SkillViewer {

    void view( SkillController controller) {
        int num;
        boolean exit = true;
        do {
            Menu.action();
            String input = null;
            try {
                input = InputFromKeyboard.input();
                if (isCorrectInteger(input)) {
                    num = Integer.parseInt(input);
                    switch (num) {
                        case 1: {
                            List<Skill> allSkills = controller.getAllSkills();
                            printAllSkills(allSkills);
                            break;
                        }
                        case 2: {
                            String inputId = InputFromKeyboard.input();
                            Skill skillById = controller.getSkillById(inputId);
                            printOneSkill(skillById);
                            break;
                        }
                        case 3: {
                            String inputSkill = InputFromKeyboard.input();
                            controller.addSkill(inputSkill);
                            break;
                        }
                        case 4: {
                            String inputId = InputFromKeyboard.input();
                            controller.updateSkillById(inputId);
                            break;
                        }
                        case 5: {
                            String inputId = InputFromKeyboard.input();
                            controller.removeSkillById(inputId);
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

    private void printOneSkill(Skill skillById) {
        System.out.println("ID = " + skillById.getId() + " skill = " + skillById.getName());
    }

    private void printAllSkills(List<Skill> allSkills) {
        System.out.println("List all skills: ");
        allSkills.stream().forEach(System.out::println);
    }
}
