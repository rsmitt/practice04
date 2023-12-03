package org.example;

import java.util.Comparator;

public class DigitComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 == null && o2 == null) {
            return 0;
        }

        if (o1 == null) {
            return -1;
        }

        if (o2 == null) {
            return 1;
        }

        return -1 * o1.compareTo(o2);
    }
}
