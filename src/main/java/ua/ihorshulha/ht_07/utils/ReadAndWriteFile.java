package ua.ihorshulha.ht_07.utils;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.impl.AccountRepositoryJavaIOImpl;
import ua.ihorshulha.ht_07.repository.impl.SkillRepositoryJavaIOImpl;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static ua.ihorshulha.ht_07.utils.Constants.SPLIT_FIELDS;

public class ReadAndWriteFile {

    private SkillRepositoryJavaIOImpl skillRepo = new SkillRepositoryJavaIOImpl();
    private AccountRepositoryJavaIOImpl accountRepo = new AccountRepositoryJavaIOImpl();

    public List<String> readFromFile(String fileName) {
        List list = new ArrayList();
        isExistFileForReadAndWrite(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines().forEach((String line) -> {

                String[] array = line.split(Constants.SPLIT_OBJECTS);
                for (String value : array) {
                    list.add(value);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Developer> readFromFileToSetDeveloper(String fileName) {
        isExistFileForReadAndWrite(fileName);
        List<Developer> listDev = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines()
                    .forEach((String note) -> {
                                Developer dev = new Developer();
                                String[] arrayValue = note.split(Constants.SPLIT_OBJECTS);
                                for (String value : arrayValue) {
                                    if (value.contains("id")) {
                                        dev.setId(Long.parseLong(value.split(SPLIT_FIELDS)[1].trim()));
                                        continue;
                                    }
                                    if (value.contains("firstName")) {
                                        dev.setFirstName(value.split(SPLIT_FIELDS)[1].trim());
                                        continue;
                                    }
                                    if (value.contains("secondName")) {
                                        dev.setSecondName(value.split(SPLIT_FIELDS)[1].trim());
                                        continue;
                                    }
                                    if (value.contains("phone")) {
                                        dev.setPhone(value.split(SPLIT_FIELDS)[1].trim());
                                        continue;
                                    }
                                    if (value.contains("age")) {
                                        dev.setAge(Integer.parseInt(value.split(SPLIT_FIELDS)[1].trim()));
                                        continue;
                                    }
                                    if (value.contains("married")) {
                                        dev.setMarried(Boolean.parseBoolean(value.split(SPLIT_FIELDS)[1].trim()));
                                        continue;
                                    }
                                    if (value.contains("create date")) {
                                        dev.setCreateDate(LocalDateTime.parse(value.substring(value.indexOf(SPLIT_FIELDS) + 1).trim(), DateTimeFormatter.ISO_DATE_TIME));
                                        continue;
                                    }
                                    if (value.contains("skills")) {
                                        Set<Skill> skills = new HashSet<>();
                                        String[] split = value.split(SPLIT_FIELDS)[1].trim().split(",");
                                        for (String s : split) {
                                            skills.add(skillRepo.getById(Long.parseLong(s)));
                                        }
                                        dev.setSkills(skills);
                                        continue;
                                    }
                                    if (value.contains("account status")) {
                                        long accountId = Long.parseLong(value.split(SPLIT_FIELDS)[1].trim());
                                        dev.setAccount(accountRepo.getById(accountId));
                                        continue;
                                    }
                                }
                                listDev.add(dev);
                            }
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listDev;
    }

    private void isExistFileForReadAndWrite(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                throw new ApplicationException(fileName + " not exist.");
            } catch (ApplicationException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToFile(String fileName, String dateFile) {
        isExistFileForReadAndWrite(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(dateFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}