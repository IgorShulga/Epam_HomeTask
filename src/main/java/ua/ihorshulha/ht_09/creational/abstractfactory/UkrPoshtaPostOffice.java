package ua.ihorshulha.ht_09.creational.abstractfactory;

import ua.ihorshulha.ht_09.creational.abstractfactory.ukrposhta.UPTeamFactory;

public class UkrPoshtaPostOffice {
    public static void main(String[] args) {
        DeliveryTeamFactory deliveryTeamFactory = new UPTeamFactory();
        Manager manager = deliveryTeamFactory.getManager();
        Driver driver = deliveryTeamFactory.getDriver();
        Postman postman = deliveryTeamFactory.getPostman();

        System.out.println("Post office UkrPoshta is working...");
        manager.manageCompany();
        driver.driveCar();
        postman.deliveryPost();
    }
}
