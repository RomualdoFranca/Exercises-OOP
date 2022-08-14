package applicationDigitSumChallenger;

import entitiesDigitSumChallenger.DigitSumChallenger;

public class Main {
    public static void main(String[] args) {
        // quando tive um output dentro do get ouset ou construtor, não é necessario inserir outro output aqui
        DigitSumChallenger digit = new DigitSumChallenger();
        digit.setDigit(-1);
        System.out.println(digit.getDigit());
        digit.setDigit(9);
        System.out.println(digit.getDigit());
        digit.setDigit(11);
        System.out.println(digit.getDigit());
        digit.setDigit(285);
        System.out.println(digit.getDigit());

    }
}
