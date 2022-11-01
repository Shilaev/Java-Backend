package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {
    // [5,2,3,1,0,4] = 0,1,2,3,4,5
    @Test
    void quickSort_BasicTest() {
        QuickSort quickSort = new QuickSort();
        List<Integer> testList = new ArrayList<>(List.of(5, 2, 3, 1, 0, 4));

        List<Integer> expected = new ArrayList<Integer>(List.of(0, 1, 2, 3, 4, 5));

        assertEquals(expected, quickSort.sort(testList));
    }

    // [5,2,3,1,0,4,6,10,9,8,7] = 0,1,2,3,4,5,6,7,8,9,10
    @Test
    void quickSort_BasicTest2() {
        QuickSort devideAndRule = new QuickSort();
        List<Integer> testList = new ArrayList<>(List.of(5, 2, 3, 1, 0, 4, 6, 10, 9, 8, 7));

        List<Integer> expected = new ArrayList<Integer>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        assertEquals(expected, devideAndRule.sort(testList));
    }
}