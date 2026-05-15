/**
 * Demonstrates:
 * - Class
 * - Object
 * - Attributes
 * - Methods
 */
class Pen {

    // Attributes / Properties
    String color;
    int tip;

    // Method to set color
    void setColor(String newColor) {
        color = newColor;
    }

    // Method to set tip size
    void setTip(int newTip) {
        tip = newTip;
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Object creation
        Pen p1 = new Pen();

        // Calling methods
        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println("Pen Color: " + p1.color);
        System.out.println("Pen Tip: " + p1.tip);
    }
}