
//9
public class Recursion {

	public static long fact(int number) {
		if (number == 0) {
			return 1;
		}

		return number * fact(number - 1);
	}

	public static void main(String[] args) {

		System.out.println(fact(6));

	}

}
