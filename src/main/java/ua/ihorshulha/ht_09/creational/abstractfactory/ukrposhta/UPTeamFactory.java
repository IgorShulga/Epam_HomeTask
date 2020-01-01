package ua.ihorshulha.ht_09.creational.abstractfactory.ukrposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.DeliveryTeamFactory;
import ua.ihorshulha.ht_09.creational.abstractfactory.Driver;
import ua.ihorshulha.ht_09.creational.abstractfactory.Manager;
import ua.ihorshulha.ht_09.creational.abstractfactory.Postman;

public class UPTeamFactory implements DeliveryTeamFactory {
    @Override
    public Manager getManager() {
        return new ManagerUP();
    }

    @Override
    public Driver getDriver() {
        return new DriverUP();
    }

    @Override
    public Postman getPostman() {
        return new PostmanUP();
    }
}
