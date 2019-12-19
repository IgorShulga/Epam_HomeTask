package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.repository.DeveloperRepository;
import ua.ihorshulha.ht_07.utils.ReadAndWriteFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ua.ihorshulha.ht_07.utils.Constants.*;

public class DeveloperRepositoryJavaIOImpl implements DeveloperRepository {

    private final BufferedReader inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
    private final ReadAndWriteFile workFile = new ReadAndWriteFile();

    private Set<Developer> storage = new TreeSet<Developer>(Comparator.comparing(Developer::getName)
            .thenComparing(Developer::getSurname)
            .thenComparing(Developer::getPhone));

    private static long generator = 0;

    @Override
    public Developer save(Developer developer) throws ApplicationException {
//        workFile.readFromFile()
        searchSameContact(developer);
        generator++;
        developer.setId(generator);
        storage.add(developer);

        return developer;
    }

    private void searchSameContact(Developer developer) {
        if (storage
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
            storage.removeIf(contact -> contact.getId() == devId);
        } else {
            try {
                throw new ApplicationException(ID_DOES_NOT_EXIST);
            } catch (ApplicationException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isThereExistDeveloper(Long devId) {
        return storage
                .stream()
                .anyMatch(contact -> contact.getId() == devId);
    }

    @Override
    public Developer getById(Long id) {
        List<Developer> developers = workFile.readFromFileToSetDeveloper(SET_PATH + DEVELOPER_FILE);
        return developers.stream().filter(dev -> dev.getId() == id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Developer> getAll() {
        return workFile.readFromFileToSetDeveloper(SET_PATH+DEVELOPER_FILE);
    }

    public boolean isExistDevById(long id) {
        List<String> dateFile = workFile.readFromFile(SET_PATH + DEVELOPER_FILE);
        Stream<Long> longIdStream = dateFile.stream()
                .map(s -> Long.parseLong(s.split(SPLIT_FIELDS)[0].trim()));
        return longIdStream.anyMatch(str -> str.equals(id));
    }
}
