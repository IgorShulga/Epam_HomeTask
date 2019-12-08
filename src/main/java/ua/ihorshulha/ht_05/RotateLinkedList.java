package ua.ihorshulha.ht_05;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class RotateLinkedList {

    List getRotateList(LinkedList<Integer> list, int k) {
        if (!Objects.isNull(list) && (list.size() != 0)) {
            int temp;
            for (int i = 1; i <= k; i++) {
                temp = list.getLast();
                list.removeLast();
                list.addFirst(temp);
            }
            return list;
        }
        throw new IllegalArgumentException("List must not be empty or null ");
    }
}
