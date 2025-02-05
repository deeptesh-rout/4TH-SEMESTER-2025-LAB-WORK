//Question 9

public class StudentString {
    int rollno;
    String name;
    String city;

    StudentString(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return "Rollno: " + rollno + ", Name: " + name + ", City: " + city;
    }

    public static void main(String args[]) {

        StudentString s1 = new StudentString(101, "Raj", "Lucknow");
        StudentString s2 = new StudentString(102, "Vijay", "Ghaziabad");
        System.out.println(s1);
        System.out.println(s2);
    }
}
