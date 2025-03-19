/*Create a Java program for university student enrollment using a Student class to 
manage course details and student information. Implement efficient garbage collection 
for memory management and use the Runtime class to monitor memory usage. 
Override the finalize() method to print a message upon successful garbage collection.  */

import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentId;
    private String name;
    private List<String> courses;

    // Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
        System.out.println("Student " + name + " (ID: " + studentId + ") enrolled.");
    }

    // Enroll in a course
    public void enrollCourse(String course) {
        courses.add(course);
        System.out.println(name + " enrolled in: " + course);
    }

    // Withdraw from all courses (make eligible for garbage collection)
    public void withdraw() {
        courses.clear();
        System.out.println(name + " has withdrawn from all courses.");
    }

    // Overriding finalize() to demonstrate garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " (ID: " + studentId + ") is being garbage collected.");
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Memory before student enrollment
        long totalBefore = runtime.totalMemory();
        long freeBefore = runtime.freeMemory();
        System.out.println("\nMemory Before Enrollment - Total Heap: " + totalBefore + ", Free Heap: " + freeBefore);

        // Creating students
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        // Enrolling students in courses
        student1.enrollCourse("Mathematics");
        student1.enrollCourse("Physics");
        student2.enrollCourse("Computer Science");

        // Memory after enrollment
        long totalAfterEnroll = runtime.totalMemory();
        long freeAfterEnroll = runtime.freeMemory();
        System.out.println("\nMemory After Enrollment - Total Heap: " + totalAfterEnroll + ", Free Heap: " + freeAfterEnroll);

        // Withdraw students and make them eligible for GC
        student1.withdraw();
        student2.withdraw();

        student1 = null;
        student2 = null;

        // Request garbage collection
        System.out.println("\nRequesting Garbage Collection...");
        System.gc();
        runtime.runFinalization();

        // Memory after garbage collection
        long totalAfterGC = runtime.totalMemory();
        long freeAfterGC = runtime.freeMemory();
        System.out.println("\nMemory After Garbage Collection - Total Heap: " + totalAfterGC + ", Free Heap: " + freeAfterGC);

        System.out.println("\nEnd of Enrollment System.");
    }
}
