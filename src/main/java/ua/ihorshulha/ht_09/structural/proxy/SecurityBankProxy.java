package ua.ihorshulha.ht_09.structural.proxy;

public class SecurityBankProxy implements Bank {

    private Bank bank;

    public SecurityBankProxy(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void setMoney(User user, Double money) {
        if (!securityAutorize(user)) {
            System.out.println("User " + user.getName() + " not authorize");
        } else {
            bank.setMoney(user, money);
        }
    }

    @Override
    public void getMoney(User user, Double money) {
        if (!securityAutorize(user)) {
            System.out.println("User " + user.getName() + " not authorize");
        } else {
            bank.getMoney(user, money);
        }
    }

    private boolean securityAutorize(User user) {
        return user.getName().equalsIgnoreCase("oksana");
    }
}
