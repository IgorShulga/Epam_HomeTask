package ua.ihorshulha.ht_08;

import java.io.PrintStream;
import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore secondSemaphore = new Semaphore(1),
            thirdSemaphore = new Semaphore(1);
    private PrintStream printStream = System.out;

    public Foo() {
        try {
            secondSemaphore.acquire();
            thirdSemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void first() {
        printStream.print("first ");
        secondSemaphore.release();
    }

    public void second() {
        try {
            secondSemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printStream.print("second ");
        secondSemaphore.release();
        thirdSemaphore.release();
    }

    public void third() {
        try {
            thirdSemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printStream.print("third");
        thirdSemaphore.release();
    }
}
