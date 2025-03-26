
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



//Reading the file in java 
public class JavaQuestion6 {

	public static void main(String[] args) {
		
		try {
			File f0=new File("C:\\Users\\student\\Desktop\\Deeptesh rout\\Example.txt");
			Scanner sa = new Scanner(f0);
				while(sa.hasNextLine()) {
					String fDate=sa.nextLine();
					System.out.println(fDate);				
				}
				sa.close();
			} catch (FileNotFoundException e) {
				System.out.println("Unexcepted error Occured.");
				e.printStackTrace();
			}

	}

}
