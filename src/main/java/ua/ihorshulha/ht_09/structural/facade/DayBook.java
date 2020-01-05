package ua.ihorshulha.ht_09.structural.facade;

public class DayBook {
    private boolean hasHomeWork;

    public boolean isHasHomeWork() {
        return hasHomeWork;
    }

    public void startHomeWork(){
        System.out.println("Home work gotten.");
        hasHomeWork = true;
    }

    public void finishHomeWork(){
        System.out.println("Home work done.");
        hasHomeWork = false;
    }
}
