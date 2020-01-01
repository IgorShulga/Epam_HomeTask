package ua.ihorshulha.ht_09.creational.singleton;

public class WorkRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start work time...");
        TimeCounter.getTimeCounter();
        Thread.sleep(5000);
        TimeCounter.getTimeCounter().showCurrentWorkTime();
        Thread.sleep(3000);
        TimeCounter.getTimeCounter().showCurrentWorkTime();
        Thread.sleep(1000);
        TimeCounter.getTimeCounter().showCurrentWorkTime();
        Thread.sleep(2000);
        System.out.println("Finish work time...");
        TimeCounter.getTimeCounter().showCurrentWorkTime();
        TimeCounter.getTimeCounter().finishTimeCounter();
    }
}
