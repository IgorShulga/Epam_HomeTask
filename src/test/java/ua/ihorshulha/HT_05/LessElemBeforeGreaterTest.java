package ua.ihorshulha.HT_05;

import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LessElemBeforeGreaterTest {

    private final LessElemBeforeGreater greater = new LessElemBeforeGreater();

    @Test
    public void testSuccessPartitionLinkedListByValue() {
        LinkedList expected = new LinkedList<>(Arrays.asList(1, 2, 2, 4, 3, 5));
        LinkedList linkedList = new LinkedList<>(Arrays.asList(1, 4, 3, 2, 5, 2));
        List actual = greater.partitionLinkedListByValue(linkedList, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSuccessPartitionLinkedListByValue2() {
        LinkedList expected = new LinkedList<>(Arrays.asList(1, 3, 2, 2, 4, 5));
        LinkedList linkedList = new LinkedList<>(Arrays.asList(1, 4, 3, 2, 5, 2));
        List actual = greater.partitionLinkedListByValue(linkedList, 4);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testFailIfNullElement() {
        LinkedList expected = new LinkedList<>(Arrays.asList(1, 3, 2, 2, 4, 5));
        LinkedList linkedList = new LinkedList<>(Arrays.asList(1, 4, 3, 2, null, 2));
        greater.partitionLinkedListByValue(linkedList, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFailLisSizeZero() {
        LinkedList linkedList = new LinkedList<>(Arrays.asList());
        greater.partitionLinkedListByValue(linkedList, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailLisNull() {
        greater.partitionLinkedListByValue(null, 4);
    }

    @Test(expected = NumberFormatException.class)
    public void testFailValueString() {
        LinkedList linkedList = new LinkedList<>(Arrays.asList(1, 4, 3, 2, 5, 2));
        greater.partitionLinkedListByValue(linkedList, Integer.parseInt("null"));
    }
}