package ua.ihorshulha.ht_09.creational.builder;

public class EthereumWalletBuilder extends CrtptoWalletBuilder {
    @Override
    void buildName() {
        cryptoWallet.setName("ETH_Wallet");
    }

    @Override
    void buildCurrency() {
        cryptoWallet.setCurrency(Currency.ETHEREUM);
    }

    @Override
    void builBalance() {
        cryptoWallet.setBalance(100);
    }
}
