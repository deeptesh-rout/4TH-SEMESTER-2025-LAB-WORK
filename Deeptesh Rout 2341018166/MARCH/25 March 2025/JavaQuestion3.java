import java.io.File;
import java.io.IOException;

public class JavaQuestion3 {
    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\student\\Desktop\\Deeptesh rout\\Example.txt";

       
        File file = new File(filePath);

        try {
           
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
