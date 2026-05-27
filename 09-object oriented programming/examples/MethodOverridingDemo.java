/**
 * Runtime Polymorphism
 * Achieved using Method Overriding
 *
 * Parent and child class
 * contain same method
 * but different definition
 */

/*
 * Parent class
 */
class Animal {

    void eat() {

        System.out.println("Eats anything");
    }
}

/*
 * Child class
 */
class Deer extends Animal {

    /*
     * Overriding eat() method
     */
    void eat() {

        System.out.println("Eats grass");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        /*
         * Creating Deer object
         */
        Deer d1 = new Deer();

        /*
         * Child class method will execute
         */
        d1.eat();
    }
}