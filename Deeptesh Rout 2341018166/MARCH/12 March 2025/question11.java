import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question11 {
    public static void main(String[] args) {
        String filePath = "data.txt"; // Change to your file name

        try {
            readFileAndProcess(filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Method to read and process file contents
    public static void readFileAndProcess(String filePath) throws IOException {
        // Using try-with-resources to ensure file closes automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;
            
            System.out.println("Processing file contents:");

            while ((line = reader.readLine()) != null) {
                lineCount++;
                System.out.println("Line " + lineCount + ": " + line.toUpperCase()); // Processing: Convert to uppercase
            }

            System.out.println("Total lines read: " + lineCount);
        }
    }
}
