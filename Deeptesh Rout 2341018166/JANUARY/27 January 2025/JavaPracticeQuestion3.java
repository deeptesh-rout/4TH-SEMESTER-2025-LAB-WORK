

// Base class Employee
class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor for Employee
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters for Employee class
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

// Derived class Manager inherits from Employee
class Manager extends Employee {
    private String department;

    // Constructor for Manager
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);  // Calling the constructor of Employee class
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Overridden method to display manager details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();  // Display employee details
        System.out.println("Department: " + department);
    }
}

public class JavaPracticeQuestion3 {
    public static void main(String[] args) {
        // Create an employee object
        Employee emp1 = new Employee("Alice", 101, 50000);
        
        // Create a manager object
        Manager mgr1 = new Manager("Bob", 102, 80000, "Sales");

        // Display employee details
        System.out.println("Employee Details:");
        emp1.displayEmployeeDetails();

        System.out.println("\nManager Details:");
        mgr1.displayEmployeeDetails();
    }
}

/* A software development company wants to build 
 * a simple program for managing its employee 
 * and managers. Each employee has basic info 
 * like name, id, salary. Managers, in addition 
 * to being employees, also manage a specific department. 
 * The program must demonstrate inheritance by creating 
 * objects for both employees and managers and displaying 
 * their details.
 */
