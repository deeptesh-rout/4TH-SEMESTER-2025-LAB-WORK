// Custom checked exception class
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class question8 {
    public static void main(String[] args) {
        try {
            validateAge(15); // Change the value to test different scenarios
        } catch (CustomCheckedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws CustomCheckedException if age is below 18
    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be 18 or above.");
        }
        System.out.println("Age is valid. Access granted.");
    }
}
