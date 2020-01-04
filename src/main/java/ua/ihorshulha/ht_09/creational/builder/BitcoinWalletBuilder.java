package ua.ihorshulha.ht_09.creational.builder;

public class BitcoinWalletBuilder extends CrtptoWalletBuilder {
    @Override
    void buildName() {
        cryptoWallet.setName("BTC_Wallet");
    }

    @Override
    void buildCurrency() {
        cryptoWallet.setCurrency(Currency.BITCOIN);
    }

    @Override
    void builBalance() {
        cryptoWallet.setBalance(200);
    }
}
