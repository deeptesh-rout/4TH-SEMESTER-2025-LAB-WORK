import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// Custom exception for file read permission issues
class FileReadPermissionException extends IOException {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class question10 {
    public static void main(String[] args) {
        try {
            // Ensure a file path is provided as a command-line argument
            if (args.length == 0) {
                throw new IllegalArgumentException("Error: No file path provided.");
            }

            String filePath = args[0]; // Get file path from arguments
            readFile(filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method to read file contents
    public static void readFile(String filePath) throws FileNotFoundException, FileReadPermissionException {
        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        // Check if the file is readable
        if (!file.canRead()) {
            throw new FileReadPermissionException("Permission denied: Cannot read the file " + filePath);
        }

        // Read and display the file contents
        try (Scanner scanner = new Scanner(file)) {
            System.out.println("File Contents:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
