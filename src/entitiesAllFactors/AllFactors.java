package entitiesAllFactors;

public class AllFactors {
    /*Write a method named printFactors with one parameter of type int named number.
If number is < 1, the method should print "Invalid Value".The method should print all factors of the number.
A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

EXAMPLE INPUT/OUTPUT:
* printFactors(6); → should print 1 2 3 6
* printFactors(32); → should print 1 2 4 8 16 32
* printFactors(10); → should print 1 2 5 10
* printFactors(-1); → should print "Invalid Value" since number is < 1

HINT: Use a while or for loop.
NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.
For example, the printout for printFactors(10); can be:

1
2
5
10
*/
    private int number;
    public AllFactors() {
        System.out.println("Empty constructor called");
    }
    public AllFactors(int number) {
        this.number = number;

    }
//    public void printFactors(int number) {
//        // validate number
//        if (this.number < 1) {
//            this.number = -1;
//        }
//        int divisor = 1;
//        while (divisor <= number) {
//            divisor++;
//            if (number % divisor == 0) {
//                this.number = divisor;
//                System.out.printf("%d", this.number);
//            }
//        }
//    }


    public void printFactors(int number) {
        // validate number
        if (number < 1) {
            number =  -1;
        }
        int divisor = 0;
        while (divisor < number) {
            divisor++;
            if (number % divisor == 0) {
                System.out.printf("%d ", divisor);
            }
        }
    }

//    public void printFactors() {
//        // validate number
//        if (getNumber() < 1) {
//            this.number = -1;
//        }
//        int divisor = 1;
//        while (divisor <= getNumber()) {
//            divisor++;
//            if (getNumber() % divisor == 0) {
//                this.number = divisor;
//                System.out.printf("%d", this.number);
//            }
//        }
//    }
    public int getNumber() {
//        return printFactors(number);
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
