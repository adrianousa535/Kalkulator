package main;

public class Kalkulator {
    public static int calc(String value) {
        String[] values = value.split(",", 0);

        int result=0;

        for(String sValue: values){
            int iValue;

            try {
                iValue = Integer.parseInt(sValue);
            } catch (Exception e){
                iValue = 0;
            }

            result += iValue;
        }

        return result;
    }

}
