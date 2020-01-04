package ua.ihorshulha.ht_09.creational.builder;

public class BuildWalletRunner {
    public static void main(String[] args) {
        Broker broker = new Broker();

//        broker.setBuilder(new BitcoinWalletBuilder());
        broker.setBuilder(new EthereumWalletBuilder());
        CryptoWallet wallet = broker.buildWallet();

        System.out.println(wallet);
    }
}
