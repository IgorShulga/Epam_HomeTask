package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.utils.Menu;
import ua.ihorshulha.ht_07.utils.ReadFiles;

import java.io.BufferedReader;
import java.io.IOException;

import static ua.ihorshulha.ht_07.utils.ActionFactory.actionFactory;
import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;

public class SkillController {

    private final ReadFiles readFiles = new ReadFiles();

    public void work(BufferedReader inputKeyboard) throws IOException {
        Menu.action(inputKeyboard);
        String input = inputKeyboard.readLine();
        isCorrectInteger(input);
        actionFactory(Integer.parseInt(input));
    }
}
