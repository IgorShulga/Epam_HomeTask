package ua.ihorshulha.ht_09.structural.flyweight;

public class Clerk implements OfficeSlave {
    @Override
    public void officeWork() {
        System.out.println("Clerk is working.");
    }
}
