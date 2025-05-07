
// Question 2
public class YieldDemo extends Thread {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " is running ");
		}
	}

	public static void main(String[] args) {

		YieldDemo t1 = new YieldDemo();
		YieldDemo t2 = new YieldDemo();
		t1.start();
		t2.start();

	}

}
