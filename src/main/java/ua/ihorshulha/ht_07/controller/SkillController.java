package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.impl.SkillRepositoryJavaIOImpl;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static ua.ihorshulha.ht_07.utils.Constants.INPUT_NAME;
import static ua.ihorshulha.ht_07.utils.Constants.MUST_NOT_BE_EMPTY;

public class SkillController {

    private final SkillRepositoryJavaIOImpl skillRepo = new SkillRepositoryJavaIOImpl();
    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();

    public List<Skill> getAllSkills() {
        return skillRepo.getAll();
    }

    public Skill getSkillById(String input) {
        long id = inputFromKeyboard.isCorrectInput(input);
        return skillRepo.getById(id);
    }

    public void updateSkillById(String inputId) {
        long id = inputFromKeyboard.isCorrectInput(inputId);
        try {
            if (skillRepo.isExistSkillById(id)) {
                skillRepo.update(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeSkillById(String inputId) {
        long id = inputFromKeyboard.isCorrectInput(inputId);
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

    public void addSkill(String inputSkill) {
        String line;
        System.out.println(INPUT_NAME);
        try {
            line = inputSkill;
            while (Objects.isNull(line) || line.isEmpty()) {
                System.out.println(MUST_NOT_BE_EMPTY);
                line = inputSkill;
            }
            skillRepo.save(new Skill(line));
        } catch (ApplicationException e) {
            System.out.println("Repeat again...");
        }
    }
}
