package ua.ihorshulha.ht_09.creational.abstractfactory.novaposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.DeliveryTeamFactory;
import ua.ihorshulha.ht_09.creational.abstractfactory.Driver;
import ua.ihorshulha.ht_09.creational.abstractfactory.Manager;
import ua.ihorshulha.ht_09.creational.abstractfactory.Postman;

public class NPTeamFactory implements DeliveryTeamFactory {
    @Override
    public Manager getManager() {
        return new ManagerNP();
    }

    @Override
    public Driver getDriver() {
        return new DriverNP();
    }

    @Override
    public Postman getPostman() {
        return new PostmanNP();
    }
}
