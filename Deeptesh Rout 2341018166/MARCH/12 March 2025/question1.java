public class question1 {
    public static void main(String[] args) {
        String input = "abc123xyz"; // Example input
        
        try {
            String numbers = extractNumbers(input);
            if (numbers.isEmpty()) {
                System.out.println("No numeric characters found in the string.");
            } else {
                System.out.println("Extracted numbers: " + numbers);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String extractNumbers(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty.");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
