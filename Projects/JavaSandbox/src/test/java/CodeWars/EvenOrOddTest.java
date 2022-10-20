package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void evenOrOddBasicTest() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.evenOrOdd(6));
        assertEquals("Odd", eoo.evenOrOdd(7));
        assertEquals("Even", eoo.evenOrOdd(0));
        assertEquals("Odd", eoo.evenOrOdd(-1));
    }
}