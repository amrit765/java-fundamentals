/**
 * Demonstrates:
 * - Hierarchical inheritance
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

class Bird extends Animal {

    void fly() {

        System.out.println("Flies");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Mammal m1 = new Mammal();
        Bird b1 = new Bird();

        m1.eat();
        m1.walk();

        b1.eat();
        b1.fly();
    }
}