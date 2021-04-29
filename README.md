# romansGoHome

Small Java application in charge of convert a valid Roman Numeral numeral into a Decimal Number.
Using Enum Types and Regular Expressions, made it with good practices like TDD, DDD, SOLID...

![Example of the App](https://github.com/Charlos16v/romansGoHome/blob/master/romansGoHome.gif?raw=true)

## RomanNumerals Numeration explanation:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| IV     | 4     |
| V      | 5     |
| IX     | 9     |
| X      | 10    |
| XL     | 40    |
| L      | 50    |
| XC     | 90    |
| C      | 100   |
| CD     | 400   |
| D      | 500   |
| CM     | 900   |
| M      | 1000  |

- I placed before V or X indicates one less, so four is IV (one less than 5) and 9 is IX (one less than 10).
- X placed before L or C indicates ten less, so forty is XL (10 less than 50) and 90 is XC (ten less than a hundred).
- C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand).
