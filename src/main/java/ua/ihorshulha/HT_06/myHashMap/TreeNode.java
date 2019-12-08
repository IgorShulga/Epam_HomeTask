package ua.ihorshulha.HT_06.myHashMap;

class TreeNode {
    int key;
    int val;
    TreeNode next;
    TreeNode prev;

    TreeNode(int key, int val) {
        next = prev = null;
        this.key = key;
        this.val = val;
    }
}
