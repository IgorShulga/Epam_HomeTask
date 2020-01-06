package ua.ihorshulha.ht_09.structural.proxy;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new SecurityBankProxy(new NewBank());
        User user1 = new User("Oksana");
        User user2 = new User("Masha");

        bank.setMoney(user1, 1000.0);
        bank.getMoney(user2, 500.0);
    }
}
