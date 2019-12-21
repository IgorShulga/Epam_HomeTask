package ua.ihorshulha.ht_08;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FooTest {

    @Test
    public void fooTest() {
        Foo foo = new Foo();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(256);
        PrintStream printStream = new PrintStream(outputStream);
        foo.setPrintStream(printStream);

        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(foo::first));
        threads.add(new Thread(foo::second));
        threads.add(new Thread(foo::third));

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

        assertEquals("first second third", outputStream.toString());
    }
}