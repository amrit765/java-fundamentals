/**
 * Problem:
 * Demonstrate Method Overloading
 * by calculating area
 */

class Area {

    /*
     * Area of square
     */
    int calculateArea(int side) {

        return side * side;
    }

    /*
     * Area of rectangle
     */
    int calculateArea(int length, int breadth) {

        return length * breadth;
    }

    /*
     * Area of circle
     */
    double calculateArea(double radius) {

        return 3.14 * radius * radius;
    }
}

public class AreaCalculator {

    public static void main(String[] args) {

        Area a1 = new Area();

        System.out.println("Square Area: "
                + a1.calculateArea(5));

        System.out.println("Rectangle Area: "
                + a1.calculateArea(4, 6));

        System.out.println("Circle Area: "
                + a1.calculateArea(3.0));
    }
}