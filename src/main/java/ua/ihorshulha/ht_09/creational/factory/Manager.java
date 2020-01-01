package ua.ihorshulha.ht_09.creational.factory;

public class Manager implements Staff{

    @Override
    public void doWork() {
        System.out.println("Manager manages work... ");
    }
}
