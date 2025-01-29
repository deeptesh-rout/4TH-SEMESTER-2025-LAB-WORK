class Employee1 {
    public double calculateSalary() {
        return 50000;  
    }
}

class Manager extends Employee1 { 
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();  
        double bonus = 10000;  
        return baseSalary + bonus;  
    }
}

public class JavaQuestion4 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        System.out.println("Employee Salary: " + emp.calculateSalary());

        Manager mgr = new Manager();
        System.out.println("Manager Salary (with bonus): " + mgr.calculateSalary());
    }
}
