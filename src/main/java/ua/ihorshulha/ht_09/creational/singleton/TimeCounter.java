package ua.ihorshulha.ht_09.creational.singleton;

public class TimeCounter {
    private static TimeCounter timeCounter;
    private final static long START_TIME = System.currentTimeMillis() / 1000;

    public static synchronized TimeCounter getTimeCounter(){
        if(timeCounter == null){
            timeCounter = new TimeCounter();
        }
        return timeCounter;
    }

    private TimeCounter(){
    }

    public void showCurrentWorkTime(){
        System.out.println("From start of time count: " + (System.currentTimeMillis() / 1000 - START_TIME) + " seconds");
    }

    public void finishTimeCounter(){
        if(TimeCounter.getTimeCounter() != null) {
            System.out.println("End count of time: " + (System.currentTimeMillis() / 1000 - START_TIME) + " seconds");
            timeCounter = null;
        } else {
            throw new RuntimeException("Counter is not exist");
        }
    }
}
