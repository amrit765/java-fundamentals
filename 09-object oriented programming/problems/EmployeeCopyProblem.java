/**
 * Problem:
 * Create copy constructor for Employee class
 */

class Employee {

    String name;
    int salary;

    /*
     * Normal constructor
     */
    Employee(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    /*
     * Copy constructor
     */
    Employee(Employee e1) {

        this.name = e1.name;
        this.salary = e1.salary;
    }

    /*
     * Display method
     */
    void display() {

        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeCopyProblem {

    public static void main(String[] args) {

        // Original object
        Employee e1 = new Employee("Amrit", 50000);

        // Copy object
        Employee e2 = new Employee(e1);

        // Display copied data
        e2.display();
    }
}