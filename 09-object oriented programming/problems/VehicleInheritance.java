/**
 * Problem:
 * Demonstrate inheritance using Vehicle
 */

/*
 * Parent class
 */
class Vehicle {

    void start() {

        System.out.println("Vehicle starts");
    }
}

/*
 * Child class
 */
class Car extends Vehicle {

    void drive() {

        System.out.println("Car is driving");
    }
}

public class VehicleInheritance {

    public static void main(String[] args) {

        // Creating object of child class
        Car c1 = new Car();

        // Inherited method
        c1.start();

        // Child class method
        c1.drive();
    }
}