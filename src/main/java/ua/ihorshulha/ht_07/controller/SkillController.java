package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.impl.SkillRepositoryImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import static ua.ihorshulha.ht_07.utils.Constants.*;
import static ua.ihorshulha.ht_07.utils.Validate.isCorrectLong;

public class SkillController {

    private SkillRepositoryImpl skillRepo = new SkillRepositoryImpl();

    public void getAllSkills() {
        System.out.println("List all skills: ");
        List<Skill> all = skillRepo.getAll();
        all.stream().forEach(System.out::println);
    }

    public Skill getSkillById(BufferedReader inputKeyboard) {
        long id = isCorrectInput(inputKeyboard);
        return skillRepo.getById(id);
    }

    public void updateSkillById(BufferedReader inputKeyboard) {
        long id = isCorrectInput(inputKeyboard);
        try {
            if (skillRepo.isExistSkillById(id)) {
                skillRepo.update(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeSkillById(BufferedReader inputKeyboard) {
        long id = isCorrectInput(inputKeyboard);
        try {
            if (skillRepo.isExistSkillById(id)) {
                skillRepo.remove(id);
            } else {
                throw new ApplicationException("Such skill not exist");
            }
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
    }

    public void addSkill(BufferedReader inputKeyboard) {
        String line = new String();
        System.out.println(INPUT_NAME);
        try {
            line = inputKeyboard.readLine();
            while (Objects.isNull(line) || line.isEmpty()) {
                System.out.println(MUST_NOT_BE_EMPTY);
                line = inputKeyboard.readLine();
            }
            skillRepo.save(new Skill(line));
        } catch (IOException | ApplicationException e) {
            System.out.println("Repeat again...");
        }
    }

    private long isCorrectInput(BufferedReader inputKeyboard) {
        boolean correct;
        System.out.println(INPUT_ID);
        long id = -1;
        String str = null;
        do {
            try {
                str = inputKeyboard.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            correct = isCorrectLong(str);
        } while (!correct);
        return Long.parseLong(str);
    }
}
