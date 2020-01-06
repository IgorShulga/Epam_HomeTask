package ua.ihorshulha.ht_09.structural.proxy;

public class NewBank implements Bank {
    @Override
    public void setMoney(User user, Double money) {
        System.out.println(user.getName() + " put " + money + " coins in NewBank ");
    }

    @Override
    public void getMoney(User user, Double money) {
        System.out.println(user.getName() + " got " + money + " coins in NewBank ");
    }
}
