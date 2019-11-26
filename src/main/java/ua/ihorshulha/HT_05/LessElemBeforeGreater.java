package ua.ihorshulha.HT_05;

import java.util.LinkedList;
import java.util.List;

public class LessElemBeforeGreater {

    public List partitionLinkedListByValue(LinkedList<Integer> list, int value) {
        int count = 0;
        for (int i = list.size() - 1; ; ) {
            int last = list.get(i);
            if (last < value) {
                list.remove(i);
                list.addFirst(last);
                count++;
            } else {
                i--;
            }
            if (count > i)
                break;
        }
        return list;
    }
}
