package ua.ihorshulha.ht_09.creational.factory;

public class ManagerFactoryImpl implements StaffFactory {
    @Override
    public Staff createStaff() {
        return new Manager();
    }
}
