package ua.ihorshulha.ht_07.view;

import ua.ihorshulha.ht_07.controller.SkillController;
import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.utils.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;
import static ua.ihorshulha.ht_07.utils.Validate.isCorrectLong;

public class SkillViewer {

    private SkillController controller = new SkillController();

    void skillView(BufferedReader inputKeyboard) {
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
                            showAll();
                            break;
                        }
                        case 2: {
                            getById(inputKeyboard);
                        }
                        case 3: {
                            try {
                                createSkill(inputKeyboard);
                            } catch (ApplicationException e) {
                                System.out.println("Repeat again...");
                            }
                            break;
                        }
                        case 4: {
//                  Update by ID
                            break;
                        }
                        case 5: {
//                     Remove by ID
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

    private void createSkill(BufferedReader inputKeyboard) throws ApplicationException {
        Skill skill = new Skill();
        System.out.println("Input name of skill");
        try {
            String line = inputKeyboard.readLine();
            while (Objects.isNull(line) || line.isEmpty()) {
                System.out.println("Name must not be empty. Repeat input");
                line = inputKeyboard.readLine();
            }
            skill.setName(line);
            controller.addSkill(skill);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Skill getById(BufferedReader inputKeyboard) {
        System.out.println("Input ID of skill");
        long id = -1;
        try {
            String str = inputKeyboard.readLine();
            isCorrectLong(str);
            id = Long.parseLong(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Skill skillById = controller.getSkillById(id);
        System.out.println(skillById.toString());
        return skillById;
    }

    private void showAll() {
        System.out.println("List all skills: ");
        List<Skill> allSkills = controller.getAllSkills();
        allSkills.stream().forEach(System.out::println);
    }
}
