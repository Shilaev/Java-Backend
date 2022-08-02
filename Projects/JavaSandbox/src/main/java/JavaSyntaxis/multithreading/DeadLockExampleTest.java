package JavaSyntaxis.multithreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadLockExampleTest {
    @Test
    void solution_total_20000() {
        int expected = 20_000;
        int actual;
    
        for (int i = 0; i < 300; i++) {
            try {
                actual = DeadLockExample.solution();
            } catch (InterruptedException e) { throw new RuntimeException(e); }
            assertEquals(expected, actual);
        }
    }
}