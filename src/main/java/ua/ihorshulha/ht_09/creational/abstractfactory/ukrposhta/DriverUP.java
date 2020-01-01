package ua.ihorshulha.ht_09.creational.abstractfactory.ukrposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.Driver;

public class DriverUP implements Driver {
    @Override
    public void driveCar() {
        System.out.println("Driver drives a car of UkrPoshta");
    }
}
