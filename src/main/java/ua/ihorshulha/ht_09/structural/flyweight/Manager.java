package ua.ihorshulha.ht_09.structural.flyweight;

public class Manager implements OfficeSlave {
    @Override
    public void officeWork() {
        System.out.println("Manager is working.");
    }
}
