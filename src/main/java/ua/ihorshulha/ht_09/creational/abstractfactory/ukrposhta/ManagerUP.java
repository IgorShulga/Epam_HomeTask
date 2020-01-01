package ua.ihorshulha.ht_09.creational.abstractfactory.ukrposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.Manager;

public class ManagerUP implements Manager {
    @Override
    public void manageCompany() {
        System.out.println("Manager manages UkrPoshta");
    }
}
