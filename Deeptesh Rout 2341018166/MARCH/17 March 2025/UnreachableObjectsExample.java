
// JAVA QUESTION 2

public class UnreachableObjectsExample {
	private String myObject;

	public UnreachableObjectsExample(String myObject) {
		this.myObject = myObject;
	}

	public static void main(String args[]) {
		// Executing testMethod1 method
		testMethod1();
		// Requesting garbage collection
		System.gc();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void testMethod1() {
		// After existing testMethod1(), the object myObjectTest1 becomes unreachable
		UnreachableObjectsExample myObjectTest1 = new UnreachableObjectsExample("myObjectTest1");
		testMethod2();
	}

	private static void testMethod2() {
		// After existing testMethod2(), the object myObjectTest2 becomes unreachable
		UnreachableObjectsExample myObjectTest2 = new UnreachableObjectsExample("myObjectTest2");
	}

	@Override
	protected void finalize() throws Throwable {
		// following line will confirm the garbage collected method name
		System.out.println("Garbage collection is succcessful for " + this.myObject);
	}
}