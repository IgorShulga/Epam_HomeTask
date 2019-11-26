package ua.ihorshulha.HT_05;

import java.util.LinkedList;
import java.util.List;

class RotateLinkedList {

    List getRotateList(LinkedList<Integer> list, int k) {
        int temp;
        for (int i = 1; i <= k; i++) {
            temp = list.getLast();
            list.removeLast();
            list.addFirst(temp);
        }
        return list;
    }
}
