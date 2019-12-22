package ua.ihorshulha.ht_08;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz(30);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);

        fizzBuzz.setPrint(new PrintStream(byteArrayOutputStream));

        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(fizzBuzz::fizz));
        threads.add(new Thread(fizzBuzz::buzz));
        threads.add(new Thread(fizzBuzz::fizzBuzz));
        threads.add(new Thread(fizzBuzz::numeric));
        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        assertEquals("0 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 FizzBuzz 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 FizzBuzz ", byteArrayOutputStream.toString());
    }
}