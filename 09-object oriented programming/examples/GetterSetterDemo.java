/**
 * Demonstrates:
 * - Encapsulation
 * - Getters
 * - Setters
 * - this keyword
 */
class PenDetails {

    // Private variables
    private String color;
    private int tip;

    // Getter for color
    String getColor() {
        return this.color;
    }

    // Getter for tip
    int getTip() {
        return this.tip;
    }

    // Setter for color
    void setColor(String color) {
        this.color = color;
    }

    // Setter for tip
    void setTip(int tip) {
        this.tip = tip;
    }
}

public class GetterSetterDemo {

    public static void main(String[] args) {

        PenDetails p1 = new PenDetails();

        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println("Color: " + p1.getColor());
        System.out.println("Tip: " + p1.getTip());
    }
}