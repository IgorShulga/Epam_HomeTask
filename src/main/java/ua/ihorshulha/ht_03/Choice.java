package ua.ihorshulha.ht_03;

import java.util.Random;

public enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    public static Choice getRundom() {
        int num = new Random().nextInt(3);
        return Choice.values()[num];
    }
}
