package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccomulatorTest {

    @Test
        // [1,2,3,4] = 10
    void sumNumsInList_BasicTest() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();
        testList.addAll(List.of(1,2,3,4));

        int expected = 10;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }

    @Test
        // [1,2,4,5,7,80] = 99
    void sumNumsInList_BasicTest2() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();
        testList.addAll(List.of(1, 2, 4, 5, 7, 80));

        int expected = 99;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }

    @Test
        // []
    void sumNumsInList_EmptyList() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();

        int expected = 0;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }

    @Test
        // [7]
    void sumNumsInList_OneElement() {
        DevideAndRule devideAndRule = new DevideAndRule();
        List<Integer> testList = new LinkedList<>();
        testList.add(7);

        int expected = 7;
        assertEquals(expected, devideAndRule.sumNumsInList(testList));
    }
}