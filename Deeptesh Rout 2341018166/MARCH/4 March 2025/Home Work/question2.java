
/*Write a Java program that implements the Comparable interface to sort a list of students 
based on their names in lexicographical order. Modify the compareTo method in the Student 
class to compare students by their names. Ensure that the program displays the list of 
students before and after sorting.
Note: The Student class must contain int id, String name, int marks, int roll
 */

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    int roll;

    // Constructor
    public Student(int id, String name, int marks, int roll) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    // Implement compareTo method to compare students by name lexicographically
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    // Override toString to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Roll: " + roll;
    }
}

public class question2 {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85, 101));
        students.add(new Student(2, "Bob", 78, 102));
        students.add(new Student(3, "Charlie", 92, 103));
        students.add(new Student(4, "David", 88, 104));

        // Displaying the list before sorting
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting the students based on name
        Collections.sort(students);

        // Displaying the list after sorting
        System.out.println("\nAfter Sorting (by name lexicographically):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
 

/*output


Before Sorting:
ID: 1, Name: Alice, Marks: 85, Roll: 101
ID: 2, Name: Bob, Marks: 78, Roll: 102
ID: 3, Name: Charlie, Marks: 92, Roll: 103
ID: 4, Name: David, Marks: 88, Roll: 104

After Sorting (by name lexicographically):
ID: 1, Name: Alice, Marks: 85, Roll: 101
ID: 2, Name: Bob, Marks: 78, Roll: 102
ID: 3, Name: Charlie, Marks: 92, Roll: 103
ID: 4, Name: David, Marks: 88, Roll: 104

 */