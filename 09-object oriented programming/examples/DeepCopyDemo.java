/**
 * Demonstrates:
 * - Deep copy
 * - Separate array creation
 */
class Student {

    String name;
    int roll;
    int marks[];

    /*
     * Deep Copy Constructor
     */
    Student(Student s1) {

        marks = new int[3];

        this.name = s1.name;
        this.roll = s1.roll;

        /*
         * Copying values one by one
         * into new array
         */
        for (int i = 0; i < marks.length; i++) {

            this.marks[i] = s1.marks[i];
        }
    }

    Student() {

        marks = new int[3];
    }
}

public class DeepCopyDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Amrit";
        s1.roll = 101;

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        /*
         * Deep copy
         */
        Student s2 = new Student(s1);

        /*
         * Changing s1 marks
         */
        s1.marks[2] = 50;

        /*
         * s2 remains unchanged
         */
        for (int i = 0; i < s2.marks.length; i++) {

            System.out.println(s2.marks[i]);
        }
    }
}