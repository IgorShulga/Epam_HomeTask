package ua.ihorshulha.ht_09.creational.factory;

public class CleanerFactory implements StaffFactory {
    @Override
    public Staff createStaff() {
        return new Cleaner();
    }
}
