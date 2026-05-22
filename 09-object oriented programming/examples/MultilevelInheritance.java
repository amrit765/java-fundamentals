/**
 * Demonstrates:
 * - Multilevel inheritance
 */
class Animal {

    void eat() {

        System.out.println("Eats");
    }
}

class Mammal extends Animal {

    void walk() {

        System.out.println("Walks");
    }
}

class Dog extends Mammal {

    void bark() {

        System.out.println("Barks");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.walk();
        d1.bark();
    }
}