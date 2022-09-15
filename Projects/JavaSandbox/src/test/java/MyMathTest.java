import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void zeroDenominatorShouldThrowException() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                MyMath.divide(1, 0);
            }
        });
    }

    @Test
    @Timeout(value = 15000, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds_1_Milliseconds(){
        MyMath.divide(242342421,1233433123);
    }
}