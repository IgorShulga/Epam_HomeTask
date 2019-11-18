package ua.ihorshulha.HT_03;

import java.util.Scanner;

public class GameRunner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CommandLine cl = new CommandLine();
        cl.run(scanner);
    }
}
