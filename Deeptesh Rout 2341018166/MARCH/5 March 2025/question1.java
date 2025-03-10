import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Student(String name, int rollNumber, double totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.totalMark, other.totalMark);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Total Mark: " + totalMark;
    }

    public static Student linearSearch(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = {
            new Student("Alice", 101, 89.5),
            new Student("Bob", 102, 75.0),
            new Student("Charlie", 103, 92.0)
        };

        System.out.print("Enter roll number to search: ");
        int rollNumber = scanner.nextInt();
        Student result = Student.linearSearch(students, rollNumber);

        if (result != null) {
            System.out.println("Student Found: " + result);
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}