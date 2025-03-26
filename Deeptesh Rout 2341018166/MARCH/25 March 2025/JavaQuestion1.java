

//Demostating the 
import java.util.Scanner;

public class JavaQuestion1 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner (System.in);
       System.out.println("Enter your name ");
       String name = scanner.nextLine();
       
       System.out.println("hello " +name + " ");
       System.err.println("This is errror ");

       scanner.close();
    }
}
