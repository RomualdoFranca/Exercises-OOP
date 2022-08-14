package applicationAllFactors;

import entitiesAllFactors.AllFactors;

public class Main {
    public static void main(String[] args) {
        AllFactors factors = new AllFactors();
//        factors.setNumber(factors.printFactors(6));
//        factors.setNumber(6);
        factors.printFactors(factors.getNumber());
        factors.setNumber(32);
        factors.printFactors(factors.getNumber());

//        System.out.println(factors.getNumber());
    }
}
