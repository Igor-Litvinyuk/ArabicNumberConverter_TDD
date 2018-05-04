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

    @Test
    public void convert_3_To_III(){
        assertEquals("III", convertToRoman(3));
    }

    @Test
    public void convert_5_To_V(){
        assertEquals("V", convertToRoman(5));
    }

    @Test
    public void convert_6_To_VI(){
        assertEquals("VI", convertToRoman(6));
    }

    @Test
    public void convert_7_To_VII(){
        assertEquals("VII", convertToRoman(7));
    }

    @Test
    public void convert_8_To_VIII(){
        assertEquals("VIII", convertToRoman(8));
    }

    private String convertToRoman(int arabicNumber) {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        return converter.convert(arabicNumber);
    }
}
