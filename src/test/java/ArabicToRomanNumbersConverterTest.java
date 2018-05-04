import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanNumbersConverterTest {

    @Test
    public void convert_0_To_EmptyString(){
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.convert(0);
        assertEquals("", romanNumber);
    }

    @Test
    public void convert_1_To_I(){
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.convert(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void convert_2_To_II(){
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.convert(2);
        assertEquals("II", romanNumber);
    }
}
