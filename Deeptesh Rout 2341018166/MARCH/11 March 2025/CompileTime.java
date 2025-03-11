

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class CompileTime {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {

        // FileNotFoundException: File does not exist
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e);
        }

        // ClassNotFoundException: Class not found
        try {
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }

        // InterruptedException example
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        }

        // NoSuchFieldException: Accessing a non-existent field
        try {
            Class<?> clazz = SomeClass.class;
            Field field = clazz.getDeclaredField("nonExistentField"); // Field does not exist
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException: " + e);
        }
    }

    // Corrected class definition
    static class SomeClass {
        @SuppressWarnings("unused")
        private int existingField = 10;
    }
}
