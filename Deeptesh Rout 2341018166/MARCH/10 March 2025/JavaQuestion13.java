import java.util.Scanner;

public class JavaQuestion13 {

  public static void main(String[] args) {
    // Logic error
    int a = 5;
    int b = 10;
    int multiplication = a * b;
    System.out.println("Addition " + multiplication);

    // Syntactical error
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number ");
    int number = scanner.nextInt();

    if (number % 2 == 1) {
      System.out.println("THe number is divisibl by 2");
    }

    // Sematic error
    float f = 10.5f;
    int i = (int) f;

    scanner.close();
  }
}
