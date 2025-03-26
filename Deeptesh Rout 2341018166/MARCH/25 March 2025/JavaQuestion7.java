import java.io.File;
public class JavaQuestion7 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\student\\Desktop\\Deeptesh rout\\Deeptesh");
		if(file.delete()) {
			System.out.println(file.getName()+" deleted sucessfully.");
		}else {
			System.out.println("Unexpected error found in deletion of file.");
		}
	}
}
