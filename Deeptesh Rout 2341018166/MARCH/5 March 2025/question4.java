import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String name;
    private int rollNo;
    private int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
    }
}

class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class question4 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 103, 20),
            new Student("Bob", 101, 22),
            new Student("Charlie", 102, 19)
        };

        Arrays.sort(students, new RollNoComparator());
        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new AgeComparator());
        System.out.println("\nSorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}