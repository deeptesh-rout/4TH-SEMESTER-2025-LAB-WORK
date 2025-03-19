import java.util.Locale;

public class question1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Length at index 7: " + str.length());
        System.out.println(String.format("Formatted: %s, %d", "Hello", 123));
        System.out.println(String.format(Locale.US, "Formatted Locale: %s, %d", "Hello", 123));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Joined String: " + String.join("-", "Hello", "World"));
        String[] elements = { "Hello", "World" };
        System.out.println("Joined String (Iterable): " + String.join("-", elements));
        System.out.println("Equals 'Hello, World!':" + str.equals("Hello, World!"));
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Concatenated String: " + str.concat("Goodbye!"));
        System.out.println("Replaced String: " + str.replace('o', '0'));
        System.out.println("Replaced String (Sequence): " + str.replace("World", "Universe"));
        System.out.println("Equals Ignore Case 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));
        String[] splitString = str.split(",");
        System.out.println("Split String: ");
        for (String s : splitString) {
            System.out.println(s.trim());
        }
        String[] splitStringLimit = str.split(",", 2);
        System.out.println("Split String (Limit): ");
        for (String s : splitStringLimit) {
            System.out.println(s.trim());
        }
        System.out.println("Interned String: " + str.intern());
        System.out.println("Index of 'W': " + str.indexOf('W'));
        System.out.println("Index of 'W' from index 8: " + str.indexOf('W', 8));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Index of 'World' from index 8: " + str.indexOf("World", 8));
        System.out.println("Lowercase String: " + str.toLowerCase());
        System.out.println("Lowercase String (Locale): " + str.toLowerCase(Locale.US));
        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Uppercase String (Locale): " + str.toUpperCase(Locale.US));
        System.out.println("Trimmed String: " + ("  Hello, World!  ".trim()));
        System.out.println("Value of String: " + String.valueOf(123));

    }

}
