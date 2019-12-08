package ua.ihorshulha.ht_05;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayToBST {

    List<Integer> list = new ArrayList();

    public List<Integer> preOrder(TreeNode root) {
        if (root != null) {
            list.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        return list;
    }

    public TreeNode getBstFromSortedArray(Integer[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = getBstFromSortedArray(arr, start, mid - 1);
        node.right = getBstFromSortedArray(arr, mid + 1, end);
        return node;
    }
}

