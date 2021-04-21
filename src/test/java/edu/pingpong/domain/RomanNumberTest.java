package edu.pingpong.domain;

import edu.pingpong.romans.domain.RomanNumber;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    public static RomanNumber romanNumber;

    @BeforeClass
    public static void setupRomanNumber() {
        romanNumber = new RomanNumber();
        romanNumber.initRegexList();
    }

    @Test
    public void isValidTest() {
        String testCase = "IIIY";
        romanNumber.setRomanNumber(testCase);
        assertFalse(romanNumber.isValidRomanNumber());
    }

    @Test
    public void SymbolMTest() {
        String testCase = "M";
        romanNumber.setRomanNumber(testCase);
        assertEquals(1000, romanNumber.convertToDecimal());

        testCase = "MM";
        romanNumber.setRomanNumber(testCase);
        assertEquals(2000, romanNumber.convertToDecimal());

        testCase = "MMM";
        romanNumber.setRomanNumber(testCase);
        assertEquals(3000, romanNumber.convertToDecimal());

        testCase = "CM";
        romanNumber.setRomanNumber(testCase);
        assertNotEquals(1000, romanNumber.convertToDecimal());
    }

    @Test
    public void threeCTest() {
        String testCase = "MMMCCC";
        romanNumber.setRomanNumber(testCase);
        assertEquals(3300, romanNumber.convertToDecimal());
    }
}
