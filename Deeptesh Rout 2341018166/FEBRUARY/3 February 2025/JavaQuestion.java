

public class JavaQuestion <T>{
	
	public void show (T n) {
		System.out.println("Name "+n);
	}

	public static void main(String[] args) {
	     JavaQuestion <String> sa = new JavaQuestion<>();
	     sa.show("Deeptesh rout");
	}

}
//write a java program for generic clas with method show 