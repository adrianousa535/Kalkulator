package main;
import java.lang.*;
import java.util.stream.Collectors;

public class Kalkulator {

    public static int calc(String value) {
        String regex = "[, \n]+";
        String[] values = value.split(regex, 0);

        boolean neg = false;

        if(values[0].length() > 2) {
            char firstChar = values[0].charAt(0);
            char secondChar = values[0].charAt(1);

            if (firstChar == '/' && secondChar == '/') {
                char separator = values[0].charAt(2);
                String newRegex = String.valueOf(separator);
                values = values[1].split(newRegex, 0);
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
            if (iValue < 0) {
                NegativeArrayList.addValue(iValue);
                neg = true;
            }
            else{
                result += iValue;
            }
        }
        validateNeg(neg);

        return result;
    }
    private static void validateNeg(boolean neg){
        if(neg) {
            String message = NegativeArrayList.myArrayList.stream().map(Object::toString).collect(Collectors.joining(", "));
            throw new NegException("I don't like your negative attitude " + message + ". Shape up, please");
        }
    }
}