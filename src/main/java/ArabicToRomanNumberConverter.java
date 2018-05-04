public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        if (arabicNumber == 0){
            return "";
        }
        else if (arabicNumber == 1){
            return "I";
        }
        else {
            return "II";
        }
    }
}
