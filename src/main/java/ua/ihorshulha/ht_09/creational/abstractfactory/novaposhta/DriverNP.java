package ua.ihorshulha.ht_09.creational.abstractfactory.novaposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.Driver;

public class DriverNP implements Driver {
    @Override
    public void driveCar() {
        System.out.println("Driver drives a car of NovaPoshta...");
    }
}
