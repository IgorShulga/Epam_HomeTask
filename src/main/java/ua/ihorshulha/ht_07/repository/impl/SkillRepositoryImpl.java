package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.SkillRepository;
import ua.ihorshulha.ht_07.utils.Constants;
import ua.ihorshulha.ht_07.utils.ReadFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SkillRepositoryImpl implements SkillRepository {

    private final ReadFiles readFiles = new ReadFiles();

    @Override
    public void save(Skill skill) {

    }

    @Override
    public void update(Long aLong) {

    }

    @Override
    public void remove(Long aLong) {

    }

    @Override
    public Skill getById(Long aLong) {
        return null;
    }

    @Override
    public List<Skill> getAll() {
        return null;
    }

    public Skill createSkill(BufferedReader inputKeyboard) throws IOException {
        Map<Long, Object> skills = readFiles.getDateFile(Constants.SKILLS_FILE);
        System.out.println("Please input name of new skill ...");
        String skillName = inputKeyboard.readLine();
        Skill skill = new Skill();
        skill.setId((long) (skills.size() + 1));
        skill.setName(skillName);
        return skill;
    }
}
