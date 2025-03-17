
public class NullifiedReferenceVariablesExample {
	private String myObject;

	public NullifiedReferenceVariablesExample(String myObject) {
		this.myObject = myObject;
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		NullifiedReferenceVariablesExample testObject1 = new NullifiedReferenceVariablesExample("testObject1");
		// Setting testObject1 to Null will qualify it for the garbage collection
		testObject1 = null;
		// Requesting garbage collection
		System.gc();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void finalize() throws Throwable {
		// following line will confirm the garbage collected method name
		System.out.println("Garbage collection is succcessful for " + this.myObject);
	}
}