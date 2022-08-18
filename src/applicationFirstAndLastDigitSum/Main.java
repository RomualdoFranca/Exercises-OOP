package applicationFirstAndLastDigitSum;

import entitiesFirstAndLastDigitSum.FirstAndLastDigitSum;

public class Main {
    public static void main(String[] args) {

        FirstAndLastDigitSum sum = new FirstAndLastDigitSum();
        sum.setNumber(sum.firstAndLastDigitSum(252));
        System.out.println(sum.getNumber());

    }
}
