package ua.ihorshulha.HT_05;

import java.util.Arrays;
//TODO Add unit tests
public class SortedArrayToBST {

    public static void preOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        TreeNode rootNode = getBstFromSortedArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        preOrder(rootNode);
    }

    public static TreeNode getBstFromSortedArray(int[] arr, int start, int end) {
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

