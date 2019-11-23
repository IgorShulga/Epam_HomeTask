package ua.ihorshulha.HT_03;

import static ua.ihorshulha.HT_03.Choice.*;

class GameLogic {

    private Choice userChoice;
    private Choice compChoice;

    GameLogic(Choice userChoice) {
        this.userChoice = userChoice;
        this.compChoice = Choice.getRundom();
    }
//  For tests
    public GameLogic() {
    }
//  For tests
    public void setUserChoice(Choice userChoice) {
        this.userChoice = userChoice;
    }
//  For tests
    public void setCompChoice(Choice compChoice) {
        this.compChoice = compChoice;
    }

    Choice getUserChoice() {
        return this.userChoice;
    }

    Choice getCompChoice() {
        return this.compChoice;
    }

    Result getResult() {
        if (userChoice.equals(compChoice)) {
            return Result.DEAD_HEAT;
        } else {
            if (userChoice.equals(ROCK)) {
                if (compChoice.equals(SCISSORS)) {
                    return Result.YOU;
                }
                if (compChoice.equals(PAPER)) {
                    return Result.COMPUTER;
                }
            } else if (userChoice.equals(PAPER)) {
                if (compChoice.equals(ROCK)) {
                    return Result.YOU;
                }
                if (compChoice.equals(SCISSORS)) {
                    return Result.COMPUTER;
                }
            } else if (userChoice.equals(SCISSORS)) {
                if (compChoice.equals(PAPER)) {
                    return Result.YOU;
                }
                if (compChoice.equals(ROCK)) {
                    return Result.COMPUTER;
                }
            }
        }
        return null;
    }
}
