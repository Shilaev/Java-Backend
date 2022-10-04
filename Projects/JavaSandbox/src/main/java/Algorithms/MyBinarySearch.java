package Algorithms;

import JavaSyntaxis.basics.Array;

import java.util.ArrayList;
import java.util.List;
/*
    Simple binary search with real numbers.
 */
public class MyBinarySearch {

    public static Integer search(List<Integer> array, int element) {
        int low = -1;
        int high = array.size() - 1;
        int mid;
        int cursor;

        while (low <= high) {
            mid = (low + high) / 2;
            cursor = array.get(mid);
            if (cursor == element) {
                System.out.println(cursor);
                return mid;
            }
            if (cursor < element) low = mid + 1;
            if (cursor > element) high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(22);
        for (int i = -100; i < 10; i++) {
            myList.add(i);
        }

        System.out.println(search(myList, 2));
    }
}
