package Algorithms;

import java.util.LinkedList;
import java.util.List;

public class DevideAndRule {
    public int sumNumsInList(List<Integer> list) {
        if (list.isEmpty()) return 0;

        return list.remove(0) + sumNumsInList(list);
    }

    public int getListSize(List<Integer> list) {
        int x = 0;
        if (list.isEmpty()) return x;

        list.remove(x);
        return (x + 1) + getListSize(list);
    }

    public int getBiggest(List<Integer> list) {
        if (list.isEmpty()) return 0;

        int maxElement = list.remove(0);
        return Math.max(maxElement, getBiggest(list));
    }

    public Integer binarySearch(List<Integer> list, int element) {
        int low = -1;
        int high = list.size();
        int mid;
        int cursor;

        mid = (low + high) / 2;
        cursor = list.remove(mid);

        if (cursor == element)
            return cursor;

        return binarySearch(list, element);
    }
}
