package entitiesDigitSumChallenger;

public class DigitSumChallenger {

    private int digit;

    public DigitSumChallenger() {
        System.out.println("Empty constructor called");

    }
    // overloading constructors
    public DigitSumChallenger(int digit) {
        this.digit = digit;
    }

/*    public int sumDigit(int digit) {
        if (this.digit < 10) {

            return -1;
        }
        int sum = 0;
        while (this.digit > 0) {
            int singleDigit = this.digit % 10;
            sum += singleDigit;
            this.digit /= 10;
        }
        digit = sum;
        return digit;
    }*/
    public int getDigit() {
        if (digit < 10) {

            return -1;
        }
        int sum = 0;
        while (digit > 0) {
            int singleDigit = digit % 10;
            sum += singleDigit;
            digit /= 10;

        }
        return sum;
    }

    public void setDigit(int digit) {

        this.digit = digit;
    }
    /*Write a method with the name sumDigits that has one int parameter called number.If parameter is >= 10 then the
    method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
    The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers,
    so also return -1 for negative numbers.

    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    Calling the method sumDigits(1) should return -1 as per requirements described above.
    Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid
    and invalid values passed as arguments.

    Hint:
    Use n % 10 to extract the least-significant digit.
    Use n = n / 10 to discard the least-significant digit.
    The method needs to be static like other methods so far in the course.

    Tip:
    Create a project with the name DigitSumChallenge.*/
}
