package ua.ihorshulha.ht_09.creational.abstractfactory;

import ua.ihorshulha.ht_09.creational.abstractfactory.novaposhta.NPTeamFactory;

public class NovaPoshtaPostOffice {
    public static void main(String[] args) {
            DeliveryTeamFactory deliveryTeamFactory = new NPTeamFactory();
            Manager manager = deliveryTeamFactory.getManager();
            Driver driver = deliveryTeamFactory.getDriver();
            Postman postman = deliveryTeamFactory.getPostman();

            System.out.println("Post office NovaPoshta is working...");
            manager.manageCompany();
            driver.driveCar();
            postman.deliveryPost();
    }
}
