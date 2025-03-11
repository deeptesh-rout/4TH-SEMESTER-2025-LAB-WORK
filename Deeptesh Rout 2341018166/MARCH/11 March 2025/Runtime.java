
import java.util.*;

public class Runtime {
    @SuppressWarnings({ "unused", "null" })
    public static void main(String[] args) {
        // ArithmeticException: Division by zero
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        // NullPointerException: Attempting to use a null reference
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

        // ArrayIndexOutOfBoundsException: Invalid array index access
        try {
            int[] numbers = new int[5];
            numbers[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }

        // StringIndexOutOfBoundsException: Trying to access an invalid index in a
        // string
        try {
            String str = "hello";
            char c = str.charAt(5); // Index out of bounds (valid range: 0-4)
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e);
        }

        // NumberFormatException: Invalid format conversion from string to number
        try {
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr); // Will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }

        // IllegalArgumentException: Invalid argument passed to method
        try {
            Character.toChars(-1); // Negative value not allowed
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e);
        }

        // IllegalStateException: Method called at an inappropriate time
        try {
            Deque<Integer> deque = new ArrayDeque<>();
            deque.remove(); // Removing from an empty deque throws IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e);
        }

        try {
            List<String> list = new ArrayList<>();
            Iterator<String> iterator = list.iterator();
            iterator.next(); // The list is empty, so this will throw NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e);
        }
    }
}
