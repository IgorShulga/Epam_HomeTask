package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.impl.SkillRepositoryImpl;
import ua.ihorshulha.ht_07.utils.ActionFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class SkillController {

    private final SkillRepositoryImpl skillRepo;
    private final ActionFactory actionFactory;

    public SkillController(SkillRepositoryImpl skillRepo, ActionFactory actionFactory) {
        this.skillRepo = skillRepo;
        this.actionFactory = actionFactory;
    }

    public List getAllSkills() {
        return skillRepo.getAll();
    }

    public Skill getSkillById(long id) {
        return skillRepo.getById(id);
    }

    public void updateSkillById(long id) {
        skillRepo.update(id);
    }

    public void removeSkillById(long id) {
        skillRepo.remove(id);
    }

    public void addSkill(Skill skill) {
        skillRepo.save(skill);
    }

    public Skill createSkill(BufferedReader inputKeyboard) throws IOException {
        return skillRepo.createSkill(inputKeyboard);
    }

    public void skillController(BufferedReader inputKeyboard) throws IOException {
        actionFactory.skillFactory(inputKeyboard);
    }
}
