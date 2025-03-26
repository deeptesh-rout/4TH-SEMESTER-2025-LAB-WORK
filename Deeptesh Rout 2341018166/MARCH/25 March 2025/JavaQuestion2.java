

import java.util.Scanner;
public class JavaQuestion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String studentNAME = scanner.next();  
		System.out.println("Enter the roll number of the student");
		int studentRollNumber = scanner.nextInt();  
		System.out.println("Enter the marks that the student obtained");
		float	studentMarks	=	scanner.nextFloat();	
		System.out.println("-------Student	Report	Card-------");
		System.out.println("Student Name:" + studentNAME);
		System.out.println("Student Roll No.:" + studentRollNumber);
		System.out.println("Student Marks:" + studentMarks);  

		scanner.close();
	}
}
