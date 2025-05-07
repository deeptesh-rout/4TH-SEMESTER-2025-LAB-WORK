
public class IsAliveDemoExample extends Thread {

	public void run() {
		System.out.println(getName() + "  Thread is running ");
	}

	public static void main(String[] args) {
		IsAliveDemoExample t1 = new IsAliveDemoExample();
		IsAliveDemoExample t2 = new IsAliveDemoExample();

		System.out.println("Before start(t1) :" + t1.isAlive());
		t1.start();
		System.out.println("After Start (t1):" + t1.isAlive());

		System.out.println("Before start (t2):" + t2.isAlive());
		t2.start();
		System.out.println("After Start (t2):" + t2.isAlive());
	}

}
