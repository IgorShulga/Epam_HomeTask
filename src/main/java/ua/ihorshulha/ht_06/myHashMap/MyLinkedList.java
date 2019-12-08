package ua.ihorshulha.ht_06.myHashMap;

class MyLinkedList {

    private LineNode head;
    private LineNode tail;

    MyLinkedList() {
        head = new LineNode(-1, -1);
        tail = new LineNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    void insertToHead(int key, int val) {
        LineNode node = search(key);
        if (node != null) {
            node.val = val;
        } else {
            LineNode newNode = new LineNode(key, val);
            LineNode nextNewNode = head.next;
            head.next = newNode;
            newNode.next = nextNewNode;
            nextNewNode.prev = newNode;
            newNode.prev = head;
        }
    }

    private LineNode search(int key) {
        LineNode node = head.next;
        while (node != tail) {
            if (node.key == key) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    int get(int key) {
        LineNode node = search(key);
        return node == null ? -1 : node.val;
    }

    void remove(int key) {
        LineNode node = search(key);
        if (node != null) {
            LineNode prevNode = node.prev;
            LineNode nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }
}
