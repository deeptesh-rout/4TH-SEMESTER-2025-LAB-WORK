/*class Employee {
    
    int employeeId;
    String employeeName;
    String designation;
    double salary;
    
    
    public void setEmployeeId(int empID) {
        this.employeeId = empID;
    }
    
   
    public int getEmployeeId() {
        return this.employeeId;
    }

 
    public void setEmployeeName(String empName) {
        this.employeeName = empName;
    }
    
    
    public String getEmployeeName() {
        return this.employeeName;
    }

   
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    public String getDesignation() {
        return this.designation;
    }

   
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative. Setting salary to 0.");
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }
    
    
    public double getSalary() {
        return this.salary;
    }
}

public class JavaPracticeQuestion1 {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        
        
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: " + emp.getSalary());
        
        
        emp.setEmployeeName("John Wick");
        emp.setDesignation("Junior Electrical Engineer");
        emp.setSalary(6000);
        
       
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: " + emp.getSalary());
    }
}

/* */