package CodeWars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleNumbersTest {

    PrimeNumbers simpleNumbers;

    @BeforeEach
    void setup() {
        simpleNumbers = new PrimeNumbers();
    }

    @Test
    void isSimple_simple_numbers() {
        // simple numbers
        int s1 = 2;
        int s2 = 83;
        int s3 = 787;
        int s4 = 997;

        assertTrue(simpleNumbers.isPrime(s1));
        assertTrue(simpleNumbers.isPrime(s2));
        assertTrue(simpleNumbers.isPrime(s3));
        assertTrue(simpleNumbers.isPrime(s4));
    }

    @Test
    void isSimple_non_simple_numbers() {
        // not simple numbers
        int ns1 = 190;
        int ns2 = 300;
        int ns3 = 812;
        int ns4 = 992;

        assertFalse(simpleNumbers.isPrime(ns1));
        assertFalse(simpleNumbers.isPrime(ns2));
        assertFalse(simpleNumbers.isPrime(ns3));
        assertFalse(simpleNumbers.isPrime(ns4));
    }
}