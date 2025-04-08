
public class LambdaFunctionInterfaceExample {

	interface PrintText {
		void print(String value);
	}

	public void printLambdaText(String text, PrintText printer) {
		printer.print(text);
	}

	public static void main(String[] args) {
		LambdaFunctionInterfaceExample obj = new LambdaFunctionInterfaceExample();
		String text = "Understanding lambdas";
		PrintText printer = (String msg) -> System.out.println(msg);
		obj.printLambdaText(text, printer);
	}
}
