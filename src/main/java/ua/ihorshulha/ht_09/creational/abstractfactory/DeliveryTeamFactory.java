package ua.ihorshulha.ht_09.creational.abstractfactory;

public interface DeliveryTeamFactory {
    Manager getManager();
    Driver getDriver();
    Postman getPostman();
}
