//QUESTION 1

/* 
class Student {
    private String name;
    private String rollNumber; // Using String to allow both integers and strings
    private int age;

    public Student(String name, Object rollNumber, int age) {
        this.name = name;
        this.rollNumber = String.valueOf(rollNumber); // Convert to String to handle both types
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }
}

public class question1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 20);
        Student student2 = new Student("Bob", "A202", 21);

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    }
}
/* */