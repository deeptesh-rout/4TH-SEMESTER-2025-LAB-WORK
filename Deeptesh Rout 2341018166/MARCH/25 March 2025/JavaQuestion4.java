
import java.io.File;

public class JavaQuestion4 {

    public static void main(String[] args) {
        File f0 = new File("C:\\Users\\student\\Desktop\\Deeptesh rout\\Example.txt");
        if(f0.exists()) {
            System.out.println("Name of the file is: " + f0.getName());        
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());        
            System.out.println("Is the file writable: " + f0.canWrite());        
            System.out.println("Is the file readable: " + f0.canRead());
            System.out.println("The size of the file in bytes: " + f0.length());
        } else {
            System.out.println("File doesn't exist.");
        }
    }
}
