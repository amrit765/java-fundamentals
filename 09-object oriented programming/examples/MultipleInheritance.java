/**
 * Java does NOT support multiple inheritance using classes.
 * It can be achieved using interfaces.
 */

/*
 * First interface
 */
interface Herbivore {

    void eatGrass();
}

/*
 * Second interface
 */
interface Carnivore {

    void eatMeat();
}

/*
 * Class implementing multiple interfaces
 */
class Bear implements Herbivore, Carnivore {

    public void eatGrass() {

        System.out.println("Bear eats grass");
    }

    public void eatMeat() {

        System.out.println("Bear eats meat");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Bear b1 = new Bear();

        b1.eatGrass();
        b1.eatMeat();
    }
}