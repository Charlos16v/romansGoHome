package edu.pingpong.romans.domain;

public class romanNumber {

    private String romanNumber = null;
    private int decimalNumber = 0;

    private romanRegex romanRegexList = new romanRegex();

    public romanNumber() {
    }

    public romanNumber(String romanNumber) {
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

    public romanRegex getRomanRegexList() {
        return romanRegexList;
    }




}
