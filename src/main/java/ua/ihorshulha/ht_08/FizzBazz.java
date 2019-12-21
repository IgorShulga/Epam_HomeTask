package ua.ihorshulha.ht_08;

import java.io.PrintStream;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class FizzBuzz {
    private final int n;
    private PrintStream printStream = System.out;
    private final AtomicInteger counter = new AtomicInteger(0);
    private final AtomicBoolean condition = new AtomicBoolean(false);

    private Semaphore fizzSemaphore = new Semaphore(0),
            buzzSemaphore = new Semaphore(0),
            fizzBuzzSemaphore = new Semaphore(0),
            numberSemaphore = new Semaphore(1);

    public FizzBuzz(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        this.n = n;
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    private void act() {
        if (counter.getAndIncrement() == n) {
            condition.set(true);
            fizzSemaphore.release();
            buzzSemaphore.release();
            fizzBuzzSemaphore.release();
            numberSemaphore.release();
        }
        else {
            if (counter.get() % 5 == 0 && counter.get() % 3 == 0) {
                fizzBuzzSemaphore.release();
            }
            else if (counter.get() % 5 == 0) {
                buzzSemaphore.release();
            }
            else if (counter.get() % 3 == 0) {
                fizzSemaphore.release();
            }
            else {
                numberSemaphore.release();
            }
        }
    }

    public void fizz() {
        while (true) {
            try {
                fizzSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            printStream.print("fizz ");
            act();
        }
    }

    public void buzz() {
        while (true) {
            try {
                buzzSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            printStream.print("buzz ");
            act();
        }
    }

    public void fizzBuzz() {
        while (true) {
            try {
                fizzBuzzSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            printStream.print("fizzBuzz ");
            act();
        }
    }

    public void numeric() {
        while (true) {
            try {
                numberSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (condition.get()) {
                break;
            }
            printStream.print(counter.get() + " ");
            act();
        }
    }
}
