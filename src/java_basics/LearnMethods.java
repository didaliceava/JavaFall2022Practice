package java_basics;

public class LearnMethods {

    /*
    Types of Methods
        1. Action (Function)
        2. Action + Return
     */

    public static void main(String[] args) {
        System.out.println(doMultiplicationThenAddition(10, 20));
    }

    static int doMultiplicationThenAddition(int num1, int num2) {
        return doMultiplication(num1, num2) + num1 + num2;
    }

    static int doMultiplication(int num1, int num2) {
        return num1 * num2;
    }

}
