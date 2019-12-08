package ua.ihorshulha.HT_06.myHashMap;

class MyLinkedList {

    private TreeNode head;
    private TreeNode tail;

    MyLinkedList() {
        head = new TreeNode(-1, -1);
        tail = new TreeNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    void insertToHead(int key, int val) {
        TreeNode node = search(key);
        if (node != null) {
            node.val = val;
        } else {
            TreeNode newNode = new TreeNode(key, val);
            TreeNode nextNewNode = head.next;
            head.next = newNode;
            newNode.next = nextNewNode;
            nextNewNode.prev = newNode;
            newNode.prev = head;
        }
    }

    private TreeNode search(int key) {
        TreeNode node = head.next;
        while (node != tail) {
            if (node.key == key) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    int get(int key) {
        TreeNode node = search(key);
        return node == null ? -1 : node.val;
    }

    void remove(int key) {
        TreeNode node = search(key);
        if (node != null) {
            TreeNode prevNode = node.prev;
            TreeNode nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }
}
