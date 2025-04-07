
// PROGRAM 3
public class HigherOrderFunction {
	
	public static int operate(int a , int b , java.util.function.IntBinaryOperator operator) {
		return operator.applyAsInt(a, b);
	}

	public static void main(String[] args) {
		
		int result = operate(5 , 10 , (a,b) -> a+b );
		System.out.println("Addition result "+result);
	}

}
