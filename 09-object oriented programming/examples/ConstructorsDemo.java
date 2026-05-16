/**
 * Demonstrates constructors in Java
 */
class Student {

    String name;
    int roll;

    /*
     * Constructor
     * Automatically called during object creation
     */
    Student() {
        System.out.println("Constructor is called...");
    }
}

public class ConstructorsDemo {

    public static void main(String[] args) {

        // Constructor gets called automatically
        Student s1 = new Student();
    }
}