package ua.ihorshulha.ht_09.creational.abstractfactory.ukrposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.Postman;

public class PostmanUP implements Postman {
    @Override
    public void deliveryPost() {
        System.out.println("Postman delivers post of UkrPoshta");
    }
}
