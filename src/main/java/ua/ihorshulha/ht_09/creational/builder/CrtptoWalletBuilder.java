package ua.ihorshulha.ht_09.creational.builder;

public abstract class CrtptoWalletBuilder {
    CryptoWallet cryptoWallet;

    void createWallet(){
        cryptoWallet = new CryptoWallet();
    }

    abstract void buildName();
    abstract void buildCurrency();
    abstract void builBalance();

    CryptoWallet getCryptoWallet(){
        return cryptoWallet;
    }
}
