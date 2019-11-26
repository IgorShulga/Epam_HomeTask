package ua.ihorshulha.HT_05;

import java.util.LinkedList;
import java.util.List;

class RotateLinkedList {

    List getRotateList(LinkedList<Integer> list) {
        int temp;
        int k = 2;
        for (int i = 1; i <= k; i++) {
            temp = list.getLast();
            list.removeLast();
            list.addFirst(temp);
        }
        return list;
    }
}
