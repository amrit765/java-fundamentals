/**
 * Abstract Class Example
 *
 * Animal is an abstract class.
 * It provides a common implementation
 * of eat() and only gives an idea
 * about walk().
 */

abstract class Animal {

    String color;

    /*
     * Constructor of abstract class
     */
    Animal() {

        color = "Brown";

        System.out.println("Animal Constructor Called");
    }

    /*
     * Normal method
     */
    void eat() {

        System.out.println("Animal eats");
    }

    /*
     * Abstract method
     * No implementation here
     */
    abstract void walk();
}

/*
 * Child Class
 */
class Horse extends Animal {

    /*
     * Implementation of abstract method
     */
    void walk() {

        System.out.println("Horse walks on 4 legs");
    }
}

/*
 * Child Class
 */
class Chicken extends Animal {

    /*
     * Implementation of abstract method
     */
    void walk() {

        System.out.println("Chicken walks on 2 legs");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        Horse h = new Horse();

        h.eat();

        h.walk();

        System.out.println();

        Chicken c = new Chicken();

        c.eat();

        c.walk();
    }
}
