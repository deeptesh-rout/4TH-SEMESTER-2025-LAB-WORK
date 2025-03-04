/*import java.util.*;
public class JavaQuestion1 {

	public static void main(String[] args) {
		ArrayList <Student> arr = new ArrayList<Student>();
		arr.add(new Student("Rama" , 22 , "999795",77.9));
        arr.add(new Student("Sita" , 22 , "999795",77.9));
        
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
     
	}
}

class Student implements Comparable<Student>  {
	String name;
    int roll;
    String phone;
    double marks;
    public Student(String n,int r,String ph,double m) {
		name=n; roll=r;phone=ph;marks=m;
		
	}
	public int compareTo(Student other) {
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
	
	public String toString() {
		return "Student [name = " + name+", Phone = "+phone+", id = "+roll+", marks = "+marks+"]";
	}

}


/*[Student [name = Rama, Phone = 999795, id = 22, marks = 77.9], Student [name = Sita, Phone = 999795, id = 22, marks = 77.9]]
[Student [name = Rama, Phone = 999795, id = 22, marks = 77.9], Student [name = Sita, Phone = 999795, id = 22, marks = 77.9]] */