package ua.ihorshulha.ht_09.creational.abstractfactory.novaposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.Manager;

public class ManagerNP implements Manager {
    @Override
    public void manageCompany() {
        System.out.println("Manager manage NovaPoshta...");
    }
}
