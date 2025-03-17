public class ReassigningReferenceExample {
	private String myObject;

	public ReassigningReferenceExample(String myObject) {
		this.myObject = myObject;
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		ReassigningReferenceExample testObject1 = new ReassigningReferenceExample("testObject1");
		ReassigningReferenceExample testObject2 = new ReassigningReferenceExample("testObject2");
		// testObject1 now refers to testObject2
		testObject1 = testObject2;
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