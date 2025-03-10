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

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getRollNumber() > students[j + 1].getRollNumber()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = {
            new Student("Alice", 103, 89.5),
            new Student("Bob", 101, 75.0),
            new Student("Charlie", 102, 92.0)
        };

        Student.bubbleSort(students);

        System.out.println("Sorted Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}