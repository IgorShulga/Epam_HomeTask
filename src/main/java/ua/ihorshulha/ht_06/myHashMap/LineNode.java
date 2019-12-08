package ua.ihorshulha.ht_06.myHashMap;

class LineNode {
    int key;
    int val;
    LineNode next;
    LineNode prev;

    LineNode(int key, int val) {
        next = prev = null;
        this.key = key;
        this.val = val;
    }
}
