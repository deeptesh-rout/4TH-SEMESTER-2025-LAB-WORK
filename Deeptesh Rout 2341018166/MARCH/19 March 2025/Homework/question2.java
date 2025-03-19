
/* String Comparison with Equals and == Operator
Write a Java program that demonstrates the difference between == and .equals() when comparing strings.
The program should:
1. Create two string objects using literals and compare them using == and .equals().
2. Create two string objects using the new keyword and compare them using == and .equals().
3. Explain the output by displaying appropriate messages about reference comparison vs. content
comparison. */

public class question2 {
    public static void main(String[] args) {
        // Case 1: Using string literals
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("Comparing string literals:");
        System.out.println("Using == : " + (str1 == str2)); // True (same memory reference)
        System.out.println("Using .equals() : " + str1.equals(str2)); // True (same content)

        // Case 2: Using new keyword
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("\nComparing strings created with new keyword:");
        System.out.println("Using == : " + (str3 == str4)); // False (different memory locations)
        System.out.println("Using .equals() : " + str3.equals(str4)); // True (same content)

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("Using '==' compares memory references, so it returns true only if both variables point to the same memory location.");
        System.out.println("Using '.equals()' compares the actual content of the strings, so it returns true if the values are the same.");
    }
}
