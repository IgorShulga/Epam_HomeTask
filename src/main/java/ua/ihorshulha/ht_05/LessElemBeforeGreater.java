package ua.ihorshulha.ht_05;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class LessElemBeforeGreater {

    List partitionLinkedListByValue(LinkedList<Integer> list, int value) {
        if (value == (int) value) {
            if (!Objects.isNull(list)) {
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
            throw new IllegalArgumentException("List must not be null");
        }
        throw new NumberFormatException("Value is not number");
    }
}
