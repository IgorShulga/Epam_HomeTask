package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Account;
import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.model.Skill;
import ua.ihorshulha.ht_07.repository.impl.DeveloperRepositoryJavaIOImpl;
import ua.ihorshulha.ht_07.repository.impl.SkillRepositoryJavaIOImpl;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeveloperController {

    private final DeveloperRepositoryJavaIOImpl devRepo = new DeveloperRepositoryJavaIOImpl();
    private final SkillRepositoryJavaIOImpl skillRepo = new SkillRepositoryJavaIOImpl();
    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();

    public List<Developer> getAllDevelopers() {
        return devRepo.getAll();
    }

    public Developer getDeveloperById() throws IOException {
        System.out.println("Input ID - ");
        String inputId = inputFromKeyboard.input();
        long id = inputFromKeyboard.isCorrectInput(inputId);
        return devRepo.getById(id);
    }

    public void addDeveloper() throws IOException {
        Developer newDev = new Developer();

        try {
            System.out.println("Input name - ");
            newDev.setFirstName(inputFromKeyboard.input());

            System.out.println("Input surname - ");
            newDev.setSecondName(inputFromKeyboard.input());

            System.out.println("Input phone - ");
            newDev.setPhone(inputFromKeyboard.input());

            System.out.println("Input number account status: \n 1-Active, 2-Banned, 3-Deleted \n ->");
            newDev.setAccount(new Account(Long.parseLong(inputFromKeyboard.input())));

            System.out.println("Input skills - ");
            newDev.setSkills(createSetSkills());

            System.out.println("Input ago - ");
            newDev.setAge(Integer.parseInt(inputFromKeyboard.input()));

            System.out.println("Input 1 if married or 0 not married - ");
            String input = inputFromKeyboard.input();
            boolean married;
            if (input.equals("1")) {
                married = true;
            } else {
                married = false;
            }
            newDev.setMarried(married);

            newDev.setCreateDate(LocalDateTime.now());

            devRepo.save(newDev);
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
    }

    public void updateDeveloperById(String inputId) {
        long id = inputFromKeyboard.isCorrectInput(inputId);
        try {
            if (devRepo.isExistDevById(id)) {
                devRepo.update(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeDeveloperById(String inputId) {
        long id = inputFromKeyboard.isCorrectInput(inputId);
        try {
            if (devRepo.isExistDevById(id)) {
                devRepo.remove(id);
            } else {
                throw new ApplicationException("Such skill not exist");
            }
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
    }

    private Set<Skill> createSetSkills() throws IOException {
        Set<Skill> skillSet = new HashSet<>();
        skillRepo.getAll().forEach(System.out::println);
        System.out.println("Input numbers separated by commas - ");
        String[] skills = inputFromKeyboard.input().split(",");
        Arrays.asList(skills).forEach(s ->
                skillSet.add(
                        new Skill(
                                Long.parseLong(s.trim())
                        )
                )
        );
        return skillSet;
    }
}
