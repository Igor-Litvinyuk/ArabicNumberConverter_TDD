import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumberConverter {

    private List<Pair<Integer, String>> map;

    public ArabicToRomanNumberConverter() {
        map = new ArrayList<>();
        map.add(new Pair<>(5, "V"));
        map.add(new Pair<>(1, "I"));
    }

    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber){
            return getDefaultRomanNumber();
        }
        return getRepeatingRomanNumber(arabicNumber);
    }

    private String getRepeatingRomanNumber(int arabicNumber) {
        String romanNumber = "";
        for (Pair<Integer, String> digit : map){
            while (arabicNumber >= digit.getKey()){
                romanNumber += digit.getValue();
                arabicNumber -= digit.getKey();
            }
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }

    private String getTestString(){
        return "testString";
    }
}
