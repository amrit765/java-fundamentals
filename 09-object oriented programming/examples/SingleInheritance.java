/**
 * Demonstrates:
 * - Inheritance
 * - Parent class
 * - Child class
 */
class Animal {

    String color;

    void eat() {

        System.out.println("Eats food");
    }

    void breathe() {

        System.out.println("Breathes");
    }
}

/*
 * Fish inherits Animal
 */
class Fish extends Animal {

    int fins;

    void swim() {

        System.out.println("Swims in water");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Fish shark = new Fish();

        // Inherited methods
        shark.eat();
        shark.breathe();

        // Fish method
        shark.swim();
    }
}
