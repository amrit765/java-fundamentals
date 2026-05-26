/**
 * Compile Time Polymorphism
 * Achieved using Method Overloading
 *
 * Same function name
 * Different parameters
 */

class Calculator {

    /*
     * Sum of 2 integers
     */
    int sum(int a, int b) {

        return a + b;
    }

    /*
     * Sum of 2 float numbers
     */
    float sum(float a, float b) {

        return a + b;
    }

    /*
     * Sum of 3 integers
     */
    int sum(int a, int b, int c) {

        return a + b + c;
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        /*
         * Calling integer method
         */
        System.out.println(c1.sum(5, 10));

        /*
         * Calling float method
         */
        System.out.println(c1.sum(2.5f, 3.5f));

        /*
         * Calling 3 parameter method
         */
        System.out.println(c1.sum(1, 2, 3));
    }
}