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

        int nextNumber;
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

    private static int findBiggest(LinkedList<Integer> collection) {
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < collection.size(); i++) {
            int temp = collection.get(i);
            if (biggest < temp)
                biggest = temp;
        }

        return collection.indexOf(biggest);
    }

    private static Integer findSmallest(LinkedList<Integer> collection) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < collection.size(); i++) {
            int temp = collection.get(i);
            if (smallest > temp)
                smallest = temp;
        }

        return collection.indexOf(smallest);
    }

    public static void main(String[] args) {
        LinkedList<Integer> myNumbs = new LinkedList<>();

        Random random = new Random(127);
        for (int i = 0; i < 1000; i++) {
            myNumbs.add(random.nextInt(-1000, 1000));
        }

//        System.out.println("Original array: " + myNumbs);
//        System.out.println("Sorted array: " +
//                selectSort(myNumbs, SelectionSortingMethod.DESC));

        double start = System.currentTimeMillis();
        selectSort(myNumbs, SelectionSortingMethod.ASC);
        double end = System.currentTimeMillis();
        System.out.println(end - start + " Milliseconds");
    }
}
