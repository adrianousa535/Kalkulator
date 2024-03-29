package test;

import main.Kalkulator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void calcEmpty() {
        String value;
        value = "";
        assertEquals(0, Kalkulator.calc(value));
    }
    @Test
    void calcOneParameter() {
        String value;
        value = "5";
        assertEquals(5, Kalkulator.calc(value));
    }
    @Test
    void calcTwoParameters() {
        String value;
        value = "5,7";
        assertEquals(12, Kalkulator.calc(value));
    }
    @Test
    void calcThreeParameters() {
        String value;
        value = "5,7,5";
        assertEquals(17, Kalkulator.calc(value));
    }
    @Test
    void calcNewLine() {
        String value;
        value = "1\n2,3";
        assertEquals(6, Kalkulator.calc(value));
    }
    @Test
    void calcSelectedSeparator() {
        String value;
        value = "//;\n1;2";
        assertEquals(3, Kalkulator.calc(value));
    }
    @Test
    void calcSelectedSeparatorV2() {
        String value;
        value = "//a\n1a2a3";
        assertEquals(6, Kalkulator.calc(value));
    }
    @Test
    void calcSelectedSeparatorV3() {
        String value;
        value = "//:\n1:2:3";
        assertEquals(6, Kalkulator.calc(value));
    }
    @Test
    void calcNegException() {
        String value;
        value = "//;\n;1;-2;2;-3";
        assertThrows(IllegalArgumentException.class, () -> {
            Kalkulator.calc(value);
        });
    }
    @Test
    void calcOverOneThousand() {
        String value;
        value = "2000,2";
        assertEquals(2, Kalkulator.calc(value));
    }
    @Test
    void calcAdvancedSeparator() {
        String value;
        value = "//[***]\n1***2***3";
        assertEquals(6, Kalkulator.calc(value));
    }
    @Test
    void calcAdvancedSeparatorV2() {
        String value;
        value = "//[abc]\n1abc2abc3";
        assertEquals(6, Kalkulator.calc(value));
    }
    @Test
    void calcManySeparators() {
        String value;
        value = "//[a][;]\n1a2;3";
        assertEquals(6, Kalkulator.calc(value));
    }
}