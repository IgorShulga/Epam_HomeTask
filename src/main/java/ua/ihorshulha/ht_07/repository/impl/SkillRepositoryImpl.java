package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.SkillRepository;
import ua.ihorshulha.ht_07.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

import static ua.ihorshulha.ht_07.utils.Constants.*;

public class SkillRepositoryImpl implements SkillRepository {

    private final ReadAndWriteFile workFile = new ReadAndWriteFile();

    @Override
    public void save(Skill skill) throws ApplicationException {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        for (String str : dateFile) {
            String name = str.split(SPLIT_FIELDS)[1].trim();
            if (name.equalsIgnoreCase(skill.getName())) {
                throw new ApplicationException("This skill is already exist");
            } else {
                skill.setId((long) (dateFile.size() + 1));
                dateFile.add(skill.getId() + SPLIT_FIELDS + skill.getName());
                String string = String.join(SPLIT_OBJECTS, dateFile);
                workFile.writeToFile(SET_PATH + SKILLS_FILE, string);
            }
        }
    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Skill getById(Long id) {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        Skill skill = new Skill();
        for (String s : dateFile) {
            long idFromFile = Long.parseLong(s.split(SPLIT_FIELDS)[0].trim());
            if (idFromFile == id) {
                skill.setName(s.split(SPLIT_FIELDS)[0].trim());
                skill.setName(s.split(SPLIT_FIELDS)[1].trim());
            }
        }
        return skill;
    }

    @Override
    public List<Skill> getAll() {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        List<Skill> list = new ArrayList<>();
        for (String s : dateFile) {
            Skill skill = new Skill();
            skill.setId(Long.parseLong(s.split(SPLIT_FIELDS)[0].trim()));
            skill.setName(s.split(SPLIT_FIELDS)[1].trim());
            list.add(skill);
        }
        return list;
    }
}
