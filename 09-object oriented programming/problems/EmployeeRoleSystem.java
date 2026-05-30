/**
 * Problem:
 * Demonstrate Method Overriding
 */

/*
 * Parent class
 */
class Employee {

    void work() {

        System.out.println("Employee works");
    }
}

/*
 * Child class
 */
class Developer extends Employee {

    /*
     * Overriding method
     */
    void work() {

        System.out.println("Developer writes code");
    }
}

/*
 * Another child class
 */
class Designer extends Employee {

    void work() {

        System.out.println("Designer creates UI");
    }
}

public class EmployeeRoleSystem {

    public static void main(String[] args) {

        Developer d1 = new Developer();

        Designer d2 = new Designer();

        d1.work();

        d2.work();
    }
}