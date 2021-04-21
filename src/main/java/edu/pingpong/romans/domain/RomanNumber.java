package edu.pingpong.romans.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {

    private String romanNumber = null;
    private int decimalNumber = 0;

    private final RomanRegex romanRegex = new RomanRegex();

    public RomanNumber() {
    }

    public RomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public String getRomanNumber() {
        return this.romanNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
        this.setDecimalNumber(0);
    }

    public int getDecimalNumber() {
        return this.decimalNumber;
    }

    public void setDecimalNumber(int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public RomanRegex getRomanRegex() {
        return this.romanRegex;
    }

    public void initRegexList() {
        getRomanRegex().addRegex("(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])"); // Summative Group
        getRomanRegex().addRegex("(C[DM])|(X[LC])|(I[VX])"); // Substractive Group
    }

    private Matcher createMatcher(String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(this.romanNumber);
    }

    private void extractDecimalValueOfRomanNumber(Matcher matcher) {
        while (matcher.find()) { //  the find() method tries to find the occurrence of a regex pattern within a given string. If multiple occurrences are found in the string, then the first call to find() will jump to the first occurrence. Thereafter, each subsequent call to the find() method will go to the next matching occurrence, one by one.
            this.decimalNumber += decimalValue(matcher.group()); // The group() method of Matcher Class is used to get the input subsequence matched by the previous match result.
        }
    }

    public int decimalValue(String romanNumber) {
        RomanSymbols symbols = Enum.valueOf(RomanSymbols.class, String.valueOf(romanNumber));
        return symbols.getDecimalValue();
    }

    public int convertToDecimal() {
        if (isValidRomanNumber(getRomanNumber())) {
            for (String regex : getRomanRegex().getRegexList()) {
                Matcher regexMatcher = createMatcher(regex);
                extractDecimalValueOfRomanNumber(regexMatcher);
            }
        } else {
            System.out.println("The number: " + getRomanNumber() + " is not a valid Roman Numeral :(");
        }
        return getDecimalNumber();
    }

    public boolean isValidRomanNumber(String romanNumber) {
        return romanNumber.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }


}
