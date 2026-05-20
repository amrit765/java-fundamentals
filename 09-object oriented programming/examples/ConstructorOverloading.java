/**
 * Demonstrates:
 * - Non-parameterized constructor
 * - Parameterized constructor
 * - Constructor overloading
 */
class Student {

    String name;
    int roll;

    /*
     * Non-parameterized constructor
     * Called when no argument is passed
     */
    Student() {

        System.out.println("Non-parameterized constructor called");
    }

    /*
     * Parameterized constructor
     * Initializes name
     */
    Student(String name) {

        // this refers to current object
        this.name = name;

        System.out.println("Name constructor called");
    }

    /*
     * Another parameterized constructor
     * Initializes roll number
     */
    Student(int roll) {

        this.roll = roll;

        System.out.println("Roll constructor called");
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        // Calls non-parameterized constructor
        Student s1 = new Student();

        // Calls constructor with String parameter
        Student s2 = new Student("Amrit");

        // Calls constructor with int parameter
        Student s3 = new Student(369);

        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}