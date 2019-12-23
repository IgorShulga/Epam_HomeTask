package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.repository.DeveloperRepository;
import ua.ihorshulha.ht_07.utils.ReadAndWriteFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ua.ihorshulha.ht_07.utils.Constants.*;

public class DeveloperRepositoryJavaIOImpl implements DeveloperRepository {

    private final BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
    private final ReadAndWriteFile workFile = new ReadAndWriteFile();

    private static Set<Developer> setDevs = new TreeSet<>(Comparator
            .comparing(Developer::getFirstName)
            .thenComparing(Developer::getSecondName)
            .thenComparing(Developer::getPhone));

    @Override
    public Developer save(Developer developer) throws ApplicationException {
        List<Developer> devs = workFile.readFromFileToSetDeveloper(DEVELOPER_FILE);
        setDevs.addAll(devs);
        searchSameContact(developer);
        developer.setId((long) (devs.size() + 1));
        setDevs.add(developer);
        String string = devToString(setDevs);
        workFile.writeToFile(DEVELOPER_FILE, string);
        return developer;
    }

    private String devToString(Set<Developer> setDevs) {
        List<String> listStringsDev = new ArrayList<>();
        for (Developer dev : setDevs) {
            String str = "id" + SPLIT_FIELDS + dev.getId() + SPLIT_OBJECTS +
                    "firstName" + SPLIT_FIELDS + dev.getFirstName() + SPLIT_OBJECTS +
                    "secondName" + SPLIT_FIELDS + dev.getSecondName() + SPLIT_OBJECTS +
                    "phone" + SPLIT_FIELDS + dev.getPhone() + SPLIT_OBJECTS +
                    "account" + SPLIT_FIELDS + dev.getAccount() + SPLIT_OBJECTS +
                    "skills" + SPLIT_FIELDS + dev.getSkills() + SPLIT_OBJECTS +
                    "age" + SPLIT_FIELDS + dev.getAge() + SPLIT_OBJECTS +
                    "married" + SPLIT_FIELDS + dev.isMarried() + SPLIT_OBJECTS +
                    "create date" + SPLIT_FIELDS + dev.getCreateDate() + SPLIT_OBJECTS;
            listStringsDev.add(str);
        }
        return String.join("\n", listStringsDev);
    }

    private void searchSameContact(Developer developer) {
        if (setDevs
                .stream()
                .anyMatch(developer::equals)) {
            try {
                throw new ApplicationException(ALREADY_EXIST);
            } catch (ApplicationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Long aLong) throws IOException {

    }

    @Override
    public void remove(Long devId) {
        if (isThereExistDeveloper(devId)) {
            setDevs.removeIf(contact -> contact.getId() == devId);
        } else {
            try {
                throw new ApplicationException(ID_DOES_NOT_EXIST);
            } catch (ApplicationException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isThereExistDeveloper(Long devId) {
        return setDevs
                .stream()
                .anyMatch(contact -> contact.getId() == devId);
    }

    @Override
    public Developer getById(Long id) {
        List<Developer> developers = workFile.readFromFileToSetDeveloper(DEVELOPER_FILE);
        return developers.stream().filter(dev -> dev.getId() == id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Developer> getAll() {
        return workFile.readFromFileToSetDeveloper(DEVELOPER_FILE);
    }

    public boolean isExistDevById(long id) {
        List<String> dateFile = workFile.readFromFile(SET_PATH + DEVELOPER_FILE);
        Stream<Long> longIdStream = dateFile.stream()
                .map(s -> Long.parseLong(s.split(SPLIT_FIELDS)[0].trim()));
        return longIdStream.anyMatch(str -> str.equals(id));
    }
}
