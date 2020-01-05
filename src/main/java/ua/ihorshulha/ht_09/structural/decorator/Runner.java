package ua.ihorshulha.ht_09.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Device device = new GameBoxTv(new SmartTv(new TV()));

        System.out.println(device.work());
    }
}
