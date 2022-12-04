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
    void calcThreeParameters(){
        String value;
        value = "5,7,5";
        assertEquals(17, Kalkulator.calc(value));
    }
    @Test
    void calcNewLine(){
        String value;
        value = "1\n2,3";
        assertEquals(6, Kalkulator.calc(value));
    }
    @Test
    void calcSelectedSeparator(){
        String value;
        value = "//;\n1;2";
        assertEquals(3, Kalkulator.calc(value));
    }

}