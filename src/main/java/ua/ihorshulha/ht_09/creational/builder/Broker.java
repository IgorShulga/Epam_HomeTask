package ua.ihorshulha.ht_09.creational.builder;

public class Broker {
    CrtptoWalletBuilder builder;

    public void setBuilder(CrtptoWalletBuilder builder) {
        this.builder = builder;
    }
    CryptoWallet buildWallet(){
        builder.createWallet();
        builder.buildName();
        builder.buildCurrency();
        builder.builBalance();

        CryptoWallet wallet = builder.getCryptoWallet();
        return wallet;
    }
}
