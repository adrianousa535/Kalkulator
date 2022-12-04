package main;
import java.lang.*;
public class Kalkulator {
    public static int calc(String value) {
        String regex = "[, \n]+";
        String[] values = value.split(regex, 0);

        if(values[0].length() > 2) {
            int firstChar = values[0].charAt(0);
            int secondChar = values[0].charAt(1);

            if (firstChar == 47 && secondChar == 47) {
                Character separator = values[0].charAt(2);
                String newRegex = "[, \n '" + separator + "']+";
                values = value.split(newRegex, 0);
            }
        }
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
