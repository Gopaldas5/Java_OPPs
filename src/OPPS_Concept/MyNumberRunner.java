package OPPS_Concept;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);
        boolean isPrime = number.isPrime();
        System.out.println("isPrime :--  " +isPrime);

        int sumUpToN = number.sumUpToN();
        System.out.println("isSum :-- "+sumUpToN);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisor :-- "+sumOfDivisors);

        System.out.println("Print  the number triangle");
        number.printNumberTriangle();

    }
}
