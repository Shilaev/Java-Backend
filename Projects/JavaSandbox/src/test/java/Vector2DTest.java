import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass // Вызывается перед каждым методом.
    public static void createNewVector2D() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        // action
        createNewVector2D();

        // assertion
        // delta = 0.000...0001
        assertEquals(0, v1.length(), EPS);
    }
}