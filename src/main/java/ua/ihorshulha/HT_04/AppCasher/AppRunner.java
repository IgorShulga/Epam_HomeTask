package ua.ihorshulha.HT_04.AppCasher;

public class AppRunner {
    public static void main(String[] args) {
        AppView view = new AppView();
        double amount = view.getAmount();
        BuissnessLogic logic = new BuissnessLogic();
        Receipt totalReciept = logic.getTotalReciept(amount);
        System.out.println(totalReciept);
    }
}
