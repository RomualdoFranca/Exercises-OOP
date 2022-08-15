package applicationEvenDigitSum;

import entitiesEvenDigitSum.EvenDigitSum;

public class Main {
    public static void main(String[] args) {
        EvenDigitSum sum = new EvenDigitSum();
        sum.setEvenDigit(252);
        System.out.println(sum.getEvenDigit());
        sum.setEvenDigit(123456789);
        System.out.println(sum.getEvenDigit());
        sum.setEvenDigit(-22);
        System.out.println(sum.getEvenDigit());

    }
}
