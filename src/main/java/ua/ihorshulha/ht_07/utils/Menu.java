package ua.ihorshulha.ht_07.utils;

import java.io.BufferedReader;

public class Menu {

    public static void mainMenu() {
        System.out.println("Choose category: ");
        System.out.println("1 - Developers");
        System.out.println("2 - Skills ");
        System.out.println("3 - Account");
        System.out.println("0 - Exit.;");
    }

    public static void action(BufferedReader inputKeyboard) {
        System.out.println("Choose action: ");
        System.out.println("1 - Get all ");
        System.out.println("2 - Get one by ID ");
        System.out.println("3 - Create new ");
        System.out.println("4 - Update by ID ");
        System.out.println("5 - Remove by ID ");
        System.out.println("0 - Main menu ");
    }
}
