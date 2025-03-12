// Custom exception class
class CustomNullPointerException extends Exception {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class question2 {
    public static void main(String[] args) {
        String input = null; // Example input (change to "" or a valid string to test)

        try {
            checkString(input);
            System.out.println("Valid string: " + input);
        } catch (CustomNullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkString(String str) throws CustomNullPointerException {
        if (str == null || str.isEmpty()) {
            throw new CustomNullPointerException("Input string cannot be null or empty.");
        }
    }
}
