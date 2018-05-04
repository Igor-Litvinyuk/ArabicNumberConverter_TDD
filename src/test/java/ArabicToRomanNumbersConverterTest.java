import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanNumbersConverterTest {

    @Test
    public void convert_0_To_EmptyString(){
        assertEquals("", convertToRoman(0));
    }

    @Test
    public void convert_1_To_I(){
        assertEquals("I", convertToRoman(1));
    }

    @Test
    public void convert_2_To_II(){
        assertEquals("II", convertToRoman(2));
    }

    private String convertToRoman(int arabicNumber) {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        return converter.convert(arabicNumber);
    }
}
