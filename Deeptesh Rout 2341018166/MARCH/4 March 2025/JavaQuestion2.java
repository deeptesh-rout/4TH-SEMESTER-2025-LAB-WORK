
import java.util.*;

public class JavaQuestion2 {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student("Rama", 22, "999795", 77.9));
        arr.add(new Student("Sita", 22, "999795", 77.9));
        
        System.out.println("Before Sorting: " + arr);
        
       
        Collections.sort(arr, new RollComparator());
        System.out.println("After Sorting by Roll Number: " + arr);
        
     
        Collections.sort(arr, new NameComparator());
        System.out.println("After Sorting by Name: " + arr);
    }
}

class Student implements Comparable<Student> {
    String name;
    int roll;
    String phone;
    double marks;

    public Student(String n, int r, String ph, double m) {
        this.name = n;
        this.roll = r;
        this.phone = ph;
        this.marks = m;
    }

    @Override
    public int compareTo(Student other) {
        // Default sorting by name
        return this.name.compareTo(other.name);
    }

    public int getRoll() {
        return roll;
    }

    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", Phone=" + phone + ", id=" + roll + ", marks=" + marks + "]";
    }
}

// Comparator for sorting by roll number
class RollComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRoll(), s2.getRoll());
    }
}


class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}


/*Before Sorting: [Student [name=Rama, Phone=999795, id=22, marks=77.9], Student [name=Sita, Phone=999795, id=22, marks=77.9]]
After Sorting by Roll Number: [Student [name=Rama, Phone=999795, id=22, marks=77.9], Student [name=Sita, Phone=999795, id=22, marks=77.9]]
After Sorting by Name: [Student [name=Rama, Phone=999795, id=22, marks=77.9], Student [name=Sita, Phone=999795, id=22, marks=77.9]] */