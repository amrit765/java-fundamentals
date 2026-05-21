/**
 * Demonstrates:
 * - Copy constructor
 * - Copying object data
 */
class Student {

    String name;
    int roll;
    String password;

    /*
     * Copy Constructor
     * Creates a new object by copying another object
     */
    Student(Student s1) {

        this.name = s1.name;
        this.roll = s1.roll;
    }

    /*
     * Normal constructor
     */
    Student() {

    }
}

public class CopyConstructorDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Amrit";
        s1.roll = 456;
        s1.password = "abcd";

        /*
         * Copying s1 into s2
         */
        Student s2 = new Student(s1);

        // Assigning different password
        s2.password = "xyz";

        System.out.println("S1 Name: " + s1.name);
        System.out.println("S2 Name: " + s2.name);

        System.out.println("S1 Roll: " + s1.roll);
        System.out.println("S2 Roll: " + s2.roll);

        System.out.println("S1 Password: " + s1.password);
        System.out.println("S2 Password: " + s2.password);
    }
}