import java.io.FileWriter;
import java.io.IOException;
public class JavaQuestion5 {

	public static void main(String[] args) {
		try {
			FileWriter f0=new FileWriter("C:\\Users\\student\\Desktop\\Deeptesh rout\\Example.txt");
			f0.write("My name is Deeptesh Rout");
			f0.close();
			System.out.println("Content is sucessfully wrote to the file.");
		} catch (IOException e) {
		    System.out.println("Unexpected erro occured");
			e.printStackTrace();
		}


	}
}
