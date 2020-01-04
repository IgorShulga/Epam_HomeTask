package ua.ihorshulha.ht_09.creational.prototype;

import ua.ihorshulha.ht_09.creational.builder.Currency;

public class GetTxRunner {
    public static void main(String[] args) {
        Tx origin = new Tx(1, Currency.BITCOIN, "10", "forSend");

        System.out.println(origin);

        TxFactory factory = new TxFactory(origin);
        Tx originClone = factory.cloneTx();
        System.out.println("\n=================\n");
        System.out.println(originClone);
    }
}
