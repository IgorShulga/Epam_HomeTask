package ua.ihorshulha.ht_09.creational.abstractfactory.novaposhta;

import ua.ihorshulha.ht_09.creational.abstractfactory.Postman;

public class PostmanNP implements Postman {
    @Override
    public void deliveryPost() {
        System.out.println("Postman delivers post of NovaPoshta");
    }
}
