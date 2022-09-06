import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D(); // action

        // assertion
        // delta = 0.000...0001
        assertEquals(0, v1.length(), 1e-9);
    }
}