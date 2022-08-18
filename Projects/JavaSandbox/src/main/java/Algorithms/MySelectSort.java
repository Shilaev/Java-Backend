package Algorithms;

import java.util.*;

public class MySelectSort {

    public static class SelectionSortingMethod {
        static final String DESC = "DESC";
        static final String ASC = "ASC";
    }

    public static LinkedList<Integer> selectSort(LinkedList<Integer> collection, String method) {
        int size = collection.size();
        LinkedList<Integer> newArray = new LinkedList<>();
        int nextNumber = 0;

        for (int i = 0; i < size; i++) {
            switch (method) {
                case SelectionSortingMethod.ASC -> nextNumber = findSmallest(collection);
                case SelectionSortingMethod.DESC -> nextNumber = findBiggest(collection);
                default -> throw new IllegalStateException("Unexpected value: " + method);
            }
            newArray.add(collection.remove(nextNumber));
        }

        return newArray;
    }

    private static Integer findBiggest(LinkedList<Integer> collection) {
        Integer biggest = Integer.MIN_VALUE;

        for (int j = 0; j < collection.size(); j++) {
            Integer temp = collection.get(j);
            if (biggest.compareTo(temp) < 0)
                biggest = temp;
        }

        return collection.indexOf(biggest);
    }

    private static Integer findSmallest(LinkedList<Integer> collection) {
        Integer smallest = Integer.MAX_VALUE;

        for (int j = 0; j < collection.size(); j++) {
            Integer temp = collection.get(j);
            if (smallest.compareTo(temp) > 0)
                smallest = temp;
        }

        return collection.indexOf(smallest);
    }

    public static void main(String[] args) {
        LinkedList<Integer> myNumbs = new LinkedList<>();
        myNumbs.add(1);
        myNumbs.add(4);
        myNumbs.add(157);
        myNumbs.add(190);
        myNumbs.add(401);
        myNumbs.add(300);
        myNumbs.add(200);
        myNumbs.add(240);
        myNumbs.add(210);
        myNumbs.add(3210);
        myNumbs.add(0);

        System.out.println(selectSort(myNumbs, SelectionSortingMethod.ASC));
    }
}
