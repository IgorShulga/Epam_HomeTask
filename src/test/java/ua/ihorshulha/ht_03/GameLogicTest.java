package ua.ihorshulha.ht_03;

import org.junit.Test;
import static org.junit.Assert.*;
import static ua.ihorshulha.ht_03.Choice.*;
import static ua.ihorshulha.ht_03.Result.*;

public class GameLogicTest {

    private GameLogic game = new GameLogic();

    @Test
    public void testSuccessDeadHeat() {
        game.setUserChoice(ROCK);
        game.setCompChoice(ROCK);
        Result result = game.getResult();
        assertEquals(DEAD_HEAT, result);
    }
    @Test
    public void testMyWinRockScissors() {
        game.setUserChoice(ROCK);
        game.setCompChoice(SCISSORS);
        Result result = game.getResult();
        assertEquals(YOU, result);
    }
    @Test
    public void testCompWinRockPaper() {
        game.setUserChoice(ROCK);
        game.setCompChoice(PAPER);
        Result result = game.getResult();
        assertEquals(COMPUTER, result);
    }
    @Test
    public void testMyWinPaperRock() {
        game.setUserChoice(PAPER);
        game.setCompChoice(ROCK);
        Result result = game.getResult();
        assertEquals(YOU, result);
    }
    @Test
    public void testCompRockPaperScissors() {
        game.setUserChoice(PAPER);
        game.setCompChoice(SCISSORS);
        Result result = game.getResult();
        assertEquals(COMPUTER, result);
    }
    @Test
    public void testMyWinScissorsPaper() {
        game.setUserChoice(SCISSORS);
        game.setCompChoice(PAPER);
        Result result = game.getResult();
        assertEquals(YOU, result);
    }
    @Test
    public void testCompWinScissorsRock() {
        game.setUserChoice(SCISSORS);
        game.setCompChoice(ROCK);
        Result result = game.getResult();
        assertEquals(COMPUTER, result);
    }
}