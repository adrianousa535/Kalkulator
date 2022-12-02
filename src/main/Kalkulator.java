package main;

public class Kalkulator {
    public static int calc(String value) {
        String[] values = value.split(",", 2);
        String value1 = values[0];
        String value2;
        int a;
        int b;
        try {
            value2 = values[1];
        } catch (Exception e) {
            value2 = "";
        }
        try {
            a = Integer.parseInt(value1);
        } catch (NumberFormatException e) {
            a = 0;
        }
        try {
            b = Integer.parseInt(value2);
        } catch (NumberFormatException e) {
            b = 0;
        }
        return a + b;
    }

}
