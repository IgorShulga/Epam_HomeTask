package ua.ihorshulha.ht_06.myHashMap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void testPutAndGet() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(0, 10);
        myHashMap.put(1, 11);
        myHashMap.put(2, 12);
        assertEquals(10, myHashMap.get(0));
        assertEquals(11, myHashMap.get(1));
        assertEquals(12, myHashMap.get(2));
    }

    @Test
    public void testGet() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(0, 10);
        myHashMap.put(1, 11);
        assertEquals(11, myHashMap.get(1));
    }

    @Test
    public void testRemove() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(0, 10);
        assertEquals(10, myHashMap.get(0));
        myHashMap.remove(0);
        assertEquals(-1, myHashMap.get(0));
    }

    @Test
    public void testNotExistKey() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(0, 10);
        assertEquals(-1, myHashMap.get(1));
    }

    @Test
    public void testEmptyMap() {
        MyHashMap myHashMap = new MyHashMap();
        assertEquals(-1, myHashMap.get(1));
    }
}