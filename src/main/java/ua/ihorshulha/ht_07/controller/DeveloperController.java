package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.repository.impl.DeveloperRepositoryImpl;

import java.io.BufferedReader;
import java.util.List;

public class DeveloperController {

    private final DeveloperRepositoryImpl developerRepo = new DeveloperRepositoryImpl();

    public void getAllDevelopers() {
        System.out.println("List of developers: ");
        List<Developer> all = developerRepo.getAll();
        all.stream().forEach(System.out::println);
    }

    public void getDeveloperById(BufferedReader inputKeyboard) {

    }

    public void addDeveloper(BufferedReader inputKeyboard) {

    }

    public void updateDeveloperById(BufferedReader inputKeyboard) {

    }

    public void removeDeveloperById(BufferedReader inputKeyboard) {

    }
}
