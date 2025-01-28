
public class JavaQuestion1 {
    public static void main(String[] args) {
        Developer dev = new Developer("Active", "John Doe", 30, "DEV123");
        dev.display();
    }
}

abstract class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person {

    private String status;

    Employee(String status, String name, int age) {
        super(name, age);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void display() {
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("NAME: " + this.getName());
        System.out.println("AGE: " + this.getAge());
    }
}

class Developer extends Employee {

    private String employeeID;

    Developer(String status, String name, int age, String employeeID) {
        super(status, name, age);  
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public void display() {
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("NAME: " + this.getName());
        System.out.println("AGE: " + this.getAge());
        System.out.println("EMPLOYEE ID: " + this.getEmployeeID());
    }
}

