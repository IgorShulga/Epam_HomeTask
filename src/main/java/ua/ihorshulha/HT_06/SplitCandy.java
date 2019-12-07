package ua.ihorshulha.HT_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class SplitCandy {

    int getAmountCandyOfSister(Integer[] candy) {
        if (Objects.isNull(candy) || candy.length == 0) {
            return 0;
        }

        int halfAmountOfCandy = candy.length / 2;
        int numberOfKinds = new HashSet<>(Arrays.asList(candy)).size();

        if (numberOfKinds <= halfAmountOfCandy) {
            return numberOfKinds;
        } else {
            while (numberOfKinds > halfAmountOfCandy) {
                numberOfKinds--;
            }
        }
        return numberOfKinds;
    }
}
