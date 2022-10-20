import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTests {

    @Test
    public void encodeBasicTest() {
        String expected = "SRAWEDOC";
        assertEquals(expected, VowelCount.encode("CODEWARS"));
    }

    @Test
    public void decodeBasicTest() {
        String expected = "CODEWARS";
        assertEquals(expected, VowelCount.encode("SRAWEDOC"));
    }
}
