package entitiesEvenDigitSum;

public class EvenDigitSum {

    /*Write a method named getEvenDigitSum with one parameter of type int called evenDigit.
    The method should return the sum of the even digits within the evenDigit.
    If the evenDigit is negative, the method should return -1 to indicate an invalid value.

    EXAMPLE INPUT/OUTPUT:
    * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
    * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
    * getEvenDigitSum(-22); → should return -1 since the evenDigit is negative
    */
    private int evenDigit;

    public EvenDigitSum() {
//        System.out.println("Empty constructor called");
    }

    public EvenDigitSum(int evenDigit) {
        this.evenDigit = evenDigit;
    }

    public int evenDigitSum() {
        if (this.evenDigit < 10) {
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while (this.evenDigit > 0) {
            digit = this.evenDigit % 10;
            this.evenDigit /= 10;
            if (digit % 2 == 0) {
                sum += digit;

            }
        }
        return sum;
    }



    public int getEvenDigit() {
        return evenDigitSum();
    }

    public void setEvenDigit(int evenDigit) {
        this.evenDigit = evenDigit;
    }

}
/*    */
/*
        }*/
