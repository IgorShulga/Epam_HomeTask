package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.impl.SkillRepositoryImpl;
import java.util.List;

public class SkillController {

    private SkillRepositoryImpl skillRepo = new SkillRepositoryImpl();


    public SkillController() {
    }

    public List<Skill> getAllSkills() {
        return skillRepo.getAll();
    }

    public Skill getSkillById(Long id) {
        return skillRepo.getById(id);
    }

    public void updateSkillById(long id) {
        skillRepo.update(id);
    }

    public void removeSkillById(long id) {
        skillRepo.remove(id);
    }

    public void addSkill(Skill skill) throws ApplicationException {
        skillRepo.save(skill);
    }

//    public Skill createSkill(BufferedReader inputKeyboard) throws IOException {
//        return skillRepo.createSkill(inputKeyboard);
//    }

//    public void skillController(BufferedReader inputKeyboard) throws IOException {
//        actionFactory.skillFactory(inputKeyboard);
//    }
}
