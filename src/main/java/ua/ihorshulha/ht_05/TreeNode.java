package ua.ihorshulha.ht_05;

import java.util.Objects;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return data == treeNode.data &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, left, right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}