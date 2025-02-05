
//JavaQuestion7
public class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String args[]) {
        // Create two Student objects
        Student s1 = new Student(101, "Deeptesh", "India");
        Student s2 = new Student(102, "Sanket", "India");

        
        System.out.println(s1);
        System.out.println(s2);
    }
}
