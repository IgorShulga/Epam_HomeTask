package ua.ihorshulha.HT_05;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class RotateLinkedListTest {

    private final RotateLinkedList rotateList = new RotateLinkedList();

    @Test
    public void testSuccessRotateList() {
        LinkedList expected = new LinkedList<>(Arrays.asList(4, 5, 1, 2, 3));
        LinkedList list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        List actual = rotateList.getRotateList(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testSuccessRotateListWithOneElem() {
        LinkedList expected = new LinkedList<>(Arrays.asList(4));
        LinkedList list = new LinkedList<>(Arrays.asList(4));
        List actual = rotateList.getRotateList(list);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testFailRotateListWithNullElem() {
        LinkedList expected = new LinkedList<>(Arrays.asList(4, 5, 1, 2, 3));
        LinkedList list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, null));
        rotateList.getRotateList(list);
    }

    @Test
    public void testFailRotateListWithNullElem2() {
        LinkedList expected = new LinkedList<>(Arrays.asList(4, 5, 1, 2, null));
        LinkedList list = new LinkedList<>(Arrays.asList(1, 2, null, 4, 5));
        List actual = rotateList.getRotateList(list);
        assertEquals(expected, actual);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRotateEmptyList() {
        LinkedList emptyList = new LinkedList();
        rotateList.getRotateList(emptyList);
    }

    @Test(expected = NullPointerException.class)
    public void testRotateNull() {
        LinkedList nullList = null;
        rotateList.getRotateList(nullList);
    }
}