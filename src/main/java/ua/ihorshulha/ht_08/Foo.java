package ua.ihorshulha.ht_08;

import java.io.PrintStream;
import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore semaphoreTwo = new Semaphore(1);
    private Semaphore semaphoreThree = new Semaphore(1);
    private PrintStream print = System.out;

    public Foo() {
        try {
            semaphoreTwo.acquire();
            semaphoreThree.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPrint(PrintStream print) {
        this.print = print;
    }

    public void first() {
        print.print("first ");
        semaphoreTwo.release();
    }

    public void second() {
        try {
            semaphoreTwo.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print.print("second ");
        semaphoreTwo.release();
        semaphoreThree.release();
    }

    public void third() {
        try {
            semaphoreThree.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print.print("third ");
        semaphoreThree.release();
    }
}
