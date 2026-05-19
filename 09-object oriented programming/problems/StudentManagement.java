/**
 * Problem:
 * Create a Student class using encapsulation.
 */
class Student {

    // Private data members
    private String name;
    private int rollNo;
    private double marks;

    // Constructor
    Student(String name, int rollNo, double marks) {

        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    double getMarks() {
        return marks;
    }

    // Setter method
    void setMarks(double marks) {
        this.marks = marks;
    }

    // Display details
    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student s1 = new Student("Amrit", 101, 89.5);

        s1.displayDetails();

        // Update marks
        s1.setMarks(95.0);

        System.out.println("\nUpdated Marks:");
        System.out.println(s1.getMarks());
    }
}