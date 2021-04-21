package edu.pingpong.domain;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import edu.pingpong.romans.domain.RomanNumber;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanNumberTest {

    public static RomanNumber romanNumber;

    @BeforeClass
    public static void setupRomanNumber() {
        romanNumber = new RomanNumber();
        romanNumber.initRegexList();
    }


    @Test
    public void SymbolMTest() {
        String testCase = "M";
        romanNumber.setRomanNumber(testCase);
        assertEquals(1000, romanNumber.convertToDecimal());

        testCase = "UMMU";
        romanNumber.setRomanNumber(testCase);
        assertEquals(2000, romanNumber.convertToDecimal());

        testCase = "UMMMU";
        romanNumber.setRomanNumber(testCase);
        assertEquals(3000, romanNumber.convertToDecimal());

        testCase = "UCMU";
        romanNumber.setRomanNumber(testCase);
        assertNotEquals(1000, romanNumber.convertToDecimal());
    }
}
