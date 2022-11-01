package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DevideAndRuleTest {

    // [1,2,3,4] = 10
    @Test
    void sumNumsInList_BasicTest() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();
        testList.addAll(List.of(1, 2, 3, 4));

        int expected = 10;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }

    // [1,2,4,5,7,80] = 99
    @Test
    void sumNumsInList_BasicTest2() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();
        testList.addAll(List.of(1, 2, 4, 5, 7, 80));

        int expected = 99;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }

    // []
    @Test
    void sumNumsInList_EmptyList() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();

        int expected = 0;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }

    // [7]
    @Test
    void sumNumsInList_OneElement() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();
        testList.add(7);

        int expected = 7;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }


    // [1,2,3,4,5,6] = 6
    @Test
    void getListSize_BasicTest() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(6);
        testList.addAll(List.of(1, 2, 3, 4, 5, 6));

        int expected = 6;
        assertEquals(expected, devideAndRule.getListSize(testList));
    }

    // [1,2,3,4,5,6] = 6
    @Test
    void getListSize_BasicTest2() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(12);
        testList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 50));

        int expected = 12;
        assertEquals(expected, devideAndRule.getListSize(testList));
    }

    // [1,2,30,4,5,7] = 30
    @Test
    void getBiggets_BasecTest() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(6);
        testList.addAll(List.of(1, 2, 30, 4, 5, 7));

        int expected = 30;
        assertEquals(expected, devideAndRule.getBiggest(testList));
    }

    // [] = 0
    @Test
    void getBiggets_EmptyList() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(0);

        int expected = 0;
        assertEquals(expected, devideAndRule.getBiggest(testList));
    }

    // [7] = 7
    @Test
    void getBiggets_OneElement() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(1);
        testList.add(7);

        int expected = 7;
        assertEquals(expected, devideAndRule.getBiggest(testList));
    }

    // [1,2,3,4,5] = 5
    @Test
    void binarySearch_BasicTest() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(5);
        testList.addAll(List.of(1, 2, 3, 4, 5));

        int expected = 5;
        assertEquals(expected, devideAndRule.binarySearch(testList, 5));
    }

    // [1,2,3,4,5] = 2
    @Test
    void binarySearch_BasicTest2() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new ArrayList<>(5);
        testList.addAll(List.of(1, 2, 3, 4, 5));

        int expected = 2;
        assertEquals(expected, devideAndRule.binarySearch(testList, 2));
    }
}