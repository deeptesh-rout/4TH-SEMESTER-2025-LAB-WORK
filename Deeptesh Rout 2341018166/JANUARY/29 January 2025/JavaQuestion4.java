class Employee {
    public double calculateSalary() {
        return 50000; // Default salary
    }
}

class Manager extends Employee {
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double bonus = 20000; // Bonus for Manager
        return baseSalary + bonus;
    }
}

public class JavaQuestion4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();

        System.out.println("Employee Salary: " + emp.calculateSalary()); // Output: 50000
        System.out.println("Manager Salary: " + mgr.calculateSalary()); // Output: 70000
    }
}
