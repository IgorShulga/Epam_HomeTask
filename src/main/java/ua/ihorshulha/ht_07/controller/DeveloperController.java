package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.repository.implIO.DeveloperRepositoryJavaIOImpl;

import java.io.BufferedReader;
import java.util.List;

public class DeveloperController {

    private final DeveloperRepositoryJavaIOImpl developerRepo = new DeveloperRepositoryJavaIOImpl();

    public List<Developer> getAllDevelopers() {
        return developerRepo.getAll();
    }

    public Developer getDeveloperById(BufferedReader inputKeyboard) {
return null;
    }

    public void addDeveloper(BufferedReader inputKeyboard) {

    }

    public void updateDeveloperById(BufferedReader inputKeyboard) {

    }

    public void removeDeveloperById(BufferedReader inputKeyboard) {

    }
}
