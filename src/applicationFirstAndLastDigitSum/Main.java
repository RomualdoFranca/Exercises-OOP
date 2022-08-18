package applicationFirstAndLastDigitSum;

import entitiesFirstAndLastDigitSum.FirstAndLastDigitSum;

public class Main {
    public static void main(String[] args) {

        FirstAndLastDigitSum sum = new FirstAndLastDigitSum();
        sum.setNumber(sum.firstAndLastDigitSum(252));
        System.out.println(sum.getNumber());
        sum.setNumber(sum.firstAndLastDigitSum(257));
        System.out.println(sum.getNumber());
        sum.setNumber(sum.firstAndLastDigitSum(5));
        System.out.println(sum.getNumber());
        sum.setNumber(sum.firstAndLastDigitSum(-5));
        System.out.println(sum.getNumber());
        FirstAndLastDigitSum sum2 = new FirstAndLastDigitSum(82);

        System.out.println(sum2.firstAndLastDigitSum(sum2.getNumber()));

    }
}
