/**
 * Problem:
 * Create employee records using OOP concepts
 */
class Employee {

    private int empId;
    private String empName;
    private double salary;

    // Constructor
    Employee(int empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Getter methods
    int getEmpId() {
        return empId;
    }

    String getEmpName() {
        return empName;
    }

    double getSalary() {
        return salary;
    }

    // Setter method
    void setSalary(double salary) {
        this.salary = salary;
    }

    // Display details
    void displayEmployee() {

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeSystem {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", 50000);

        e1.displayEmployee();

        // Update salary
        e1.setSalary(60000);

        System.out.println("\nUpdated Salary: " + e1.getSalary());
    }
}