package ua.ihorshulha.ht_08;

import java.io.PrintStream;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzz {
    private final int n;
    private PrintStream print = System.out;
    private final AtomicInteger counter = new AtomicInteger(0);
    private final AtomicBoolean condition = new AtomicBoolean(false);

    private Semaphore fizzSem = new Semaphore(0);
    private Semaphore buzzSem = new Semaphore(0);
    private Semaphore fizzBuzzSem = new Semaphore(0);
    private Semaphore numSem = new Semaphore(1);

    FizzBuzz(int n) {
        this.n = n;
    }

    void setPrint(PrintStream print) {
        this.print = print;
    }

    private void act() {
        if (counter.getAndIncrement() == n) {
            condition.set(true);
            fizzSem.release();
            buzzSem.release();
            fizzBuzzSem.release();
            numSem.release();
        } else {
            if (counter.get() % 5 == 0 && counter.get() % 3 == 0) {
                fizzBuzzSem.release();
            } else if (counter.get() % 5 == 0) {
                buzzSem.release();
            } else if (counter.get() % 3 == 0) {
                fizzSem.release();
            } else {
                numSem.release();
            }
        }
    }

    void fizz() {
        while (true) {
            try {
                fizzSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            print.print("fizz ");
            act();
        }
    }

    void buzz() {
        while (true) {
            try {
                buzzSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            print.print("buzz ");
            act();
        }
    }

    void fizzBuzz() {
        while (true) {
            try {
                fizzBuzzSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            print.print("FizzBuzz ");
            act();
        }
    }

    void numeric() {
        while (true) {
            try {
                numSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            print.print(counter.get() + " ");
            act();
        }
    }
}
