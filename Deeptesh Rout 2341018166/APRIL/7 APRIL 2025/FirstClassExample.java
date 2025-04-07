

public class FirstClassExample {

	public static void main(String[] args) {
		java.util.function.IntBinaryOperator add = (a ,b) -> a+b;
		
		System.out.println("Addition result "+add.applyAsInt(5, 10));
	}

}
