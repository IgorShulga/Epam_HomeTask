package ua.ihorshulha.HT_06.myHashMap;

public class MyHashMap {
    private MyLinkedList[] bucket;
    private int capacity;

    public MyHashMap() {
        this.capacity = 10000;
        this.bucket = new MyLinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            bucket[i] = new MyLinkedList();
        }
    }

    public void put(int key, int val) {
        int bucketId = hashCode(key);
        bucket[bucketId].insertToHead(key, val);
    }

    public int get(int key) {
        int bucketId = hashCode(key);
        return bucket[bucketId].get(key);
    }

    public void remove(int key) {
        int bucketId = hashCode(key);
        bucket[bucketId].remove(key);
    }

    private int hashCode(int key) {
        return Integer.hashCode(key) % capacity;
    }
}
