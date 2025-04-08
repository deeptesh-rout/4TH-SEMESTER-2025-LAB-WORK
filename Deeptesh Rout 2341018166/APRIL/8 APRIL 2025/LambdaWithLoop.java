
import java.util.Arrays;
import java.util.List;

public class LambdaWithLoop {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> student1 = Arrays.asList(50, 60, 70, 80, 90);
		System.out.println("Marks for Student 1");
		student1.forEach(mark -> System.out.println(mark));

		List<Integer> student2 = Arrays.asList(90, 80, 70, 60, 50);
		System.out.println("Marks for Student 2");
		student1.forEach(System.out::println);

	}

}
