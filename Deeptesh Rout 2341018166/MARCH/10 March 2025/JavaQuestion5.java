import java.util.Scanner;

public class JavaQuestion5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number ");
    int number = scanner.nextInt();

    if (number % 2 == 1) {
      System.out.println("THe number is divisibl by 2");
    }

    scanner.close();
  }
}
