
/*Write a program that calculates factorial using a recursive lambda expression.
Define a recursive lambda expression to calculate factorial.
Use the lambda expression to calculate the factorial of a given number.
Note: Use Scanner class for user input. */


import java.util.Scanner;

@FunctionalInterface
interface RecursiveFactorial {
    int apply(RecursiveFactorial self, int n);
}

public class javaQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int number = sc.nextInt();

        // Recursive factorial using lambda expression
        RecursiveFactorial factorial = (self, n) -> {
            if (n <= 1) return 1;
            return n * self.apply(self, n - 1);
        };

        int result = factorial.apply(factorial, number);
        System.out.println("Factorial of " + number + " is: " + result);

        sc.close();
    }
}
