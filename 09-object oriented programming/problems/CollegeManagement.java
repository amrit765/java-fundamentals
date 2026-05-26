/**
 * Problem:
 * Create Student and Teacher classes
 * using inheritance
 */

/*
 * Parent class
 */
class Person {

    String name;

    void displayName() {

        System.out.println("Name : " + name);
    }
}

/*
 * Student class inheriting Person
 */
class Student extends Person {

    int rollNo;

    void displayRoll() {

        System.out.println("Roll No : " + rollNo);
    }
}

/*
 * Teacher class inheriting Person
 */
class Teacher extends Person {

    String subject;

    void displaySubject() {

        System.out.println("Subject : " + subject);
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        // Student object
        Student s1 = new Student();

        s1.name = "Amrit";
        s1.rollNo = 101;

        s1.displayName();
        s1.displayRoll();

        System.out.println();

        // Teacher object
        Teacher t1 = new Teacher();

        t1.name = "Rahul Sir";
        t1.subject = "Java";

        t1.displayName();
        t1.displaySubject();
    }
}