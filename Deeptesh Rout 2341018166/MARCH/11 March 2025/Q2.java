
// Compile Time exceptions
import java.io.*;

public class Q2 {

    public static void main(String[] args) {
        // FileNotFoundException
        try {
            FileReader file = new FileReader("NoneExistaentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found: " + e.getMessage());
        }

        // ClassNotFoundException
        try {
             Class.forName("com.example.Dog");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

        // IOException 
        try {
            FileReader file = new FileReader("NoneExistaentfile.txt");  // This will throw FileNotFoundException
            file.close(); 
            } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // NoSuchFieldException
        try {
            // This will throw NoSuchFieldException because we are trying to access a non-existent field
            Class<?> cls = String.class;
            cls.getDeclaredField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("No Such Field Exception: " + e.getMessage());
        }

        // NoSuchMethodException
        try {
            Class<?> cls = String.class;
            cls.getDeclaredMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("No Such Method Exception: " + e.getMessage());
        }
    }
}