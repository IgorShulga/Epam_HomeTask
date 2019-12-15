package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.SkillRepository;
import ua.ihorshulha.ht_07.utils.ReadAndWriteFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static ua.ihorshulha.ht_07.utils.Constants.*;

public class SkillRepositoryImpl implements SkillRepository {

    private final BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
    private final ReadAndWriteFile workFile = new ReadAndWriteFile();

    @Override
    public void save(Skill skill) throws ApplicationException {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        Stream<String> stringStream = dateFile
                .stream()
                .map(s -> s.split(SPLIT_FIELDS)[1].trim());

        if (stringStream.anyMatch(str -> str.equalsIgnoreCase(skill.getName()))) {
            throw new ApplicationException(ALREADY_EXIST);
        } else {
            skill.setId((long) (dateFile.size() + 1));
            dateFile.add(skill.getId() + SPLIT_FIELDS + skill.getName());
            String string = String.join(SPLIT_OBJECTS, dateFile);
            workFile.writeToFile(SET_PATH + SKILLS_FILE, string);
        }
    }

    @Override
    public void update(Long id) throws IOException {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        for (int i = 0; i < dateFile.size(); i++) {
            if (id == Long.parseLong(dateFile.get(i).split(SPLIT_FIELDS)[0].trim())) {
                String name = dateFile.get(i).split(SPLIT_FIELDS)[1].trim();
                String newName = updateNameSkill(name);
                dateFile.set(i, id + SPLIT_FIELDS + newName);
            }
        }
        String string = String.join(SPLIT_OBJECTS, dateFile);
        workFile.writeToFile(SET_PATH + SKILLS_FILE, string);
    }

    private String updateNameSkill(String name) throws IOException {
        System.out.println("Input new Name for skill...");
        String line;
        do {
            System.out.println("Name must not be empty or null.");
            line = inputKeyboard.readLine();
        } while (Objects.isNull(line) || line.isEmpty());
        return line;
    }

    @Override
    public void remove(Long id) {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        dateFile.removeIf(s -> (id == Long.parseLong(s.split(SPLIT_FIELDS)[0].trim())));
        String string = String.join(SPLIT_OBJECTS, dateFile);
        workFile.writeToFile(SET_PATH + SKILLS_FILE, string);
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

    public boolean isExistSkillById(long id) {
        List<String> dateFile = workFile.readFromFile(SET_PATH + SKILLS_FILE);
        Stream<Long> longIdStream = dateFile.stream()
                .map(s -> Long.parseLong(s.split(SPLIT_FIELDS)[0].trim()));
        return longIdStream.anyMatch(str -> str.equals(id));
    }
}
