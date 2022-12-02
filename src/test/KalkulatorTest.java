package test;

import main.Kalkulator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void calcEmpty() {
        String value;
        value = "";
        Assertions.assertEquals(0, Kalkulator.calc(value));
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
}