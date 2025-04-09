
/*Write a Java program that takes a LocalDateTime object and formats it to a custom string format ("yyyy-MM-dd HH:mm:ss").
Define a LocalDateTime object representing a specific date and time.
Use DateTimeFormatter to format the LocalDateTime object to the desired string format. */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javaQuestion3 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2025, 4, 9, 15, 45, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDateTime);
    }
}
