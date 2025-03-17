
public class JavaQuestion1 {
	public void finalize() {
		System.out.println("Object garbage collected");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JavaQuestion1 t1 = new JavaQuestion1();
		JavaQuestion1 t2 = new JavaQuestion1();
		JavaQuestion1 t3 = new JavaQuestion1();
		
		t1 = null;
		t2 = t3;
		System.gc();
	}
}
