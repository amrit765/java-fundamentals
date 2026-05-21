/**
 * Demonstrates:
 * - Shallow copy
 * - Reference sharing problem
 */
class Student {

    String name;
    int roll;
    int marks[];

    /*
     * Shallow Copy Constructor
     * Array reference is copied
     * New array is NOT created
     */
    Student(Student s1) {

        this.name = s1.name;
        this.roll = s1.roll;

        // Same array reference copied
        this.marks = s1.marks;
    }

    Student() {

        marks = new int[3];
    }
}

public class ShallowCopyDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Amrit";
        s1.roll = 101;

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        /*
         * Copying object
         */
        Student s2 = new Student(s1);

        /*
         * Changing marks of s1
         */
        s1.marks[2] = 50;

        /*
         * s2 will also change
         * because both point to same array
         */
        for (int i = 0; i < s2.marks.length; i++) {

            System.out.println(s2.marks[i]);
        }
    }
}