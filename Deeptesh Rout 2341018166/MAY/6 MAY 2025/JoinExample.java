
//Question 5
public class JoinExample extends Thread {

	public void run() {
		for (int i = 0; i <= 2; i++) {
			System.out.println(getName() + " running ");
		}
	}

	public static void main(String[] args) {
		JoinExample t1 = new JoinExample();
		JoinExample t2 = new JoinExample();
		JoinExample t3 = new JoinExample();

		try {
			t1.join(100);
		} catch (InterruptedException e) {

		}

		t2.start();

		t1.start();

		t3.start();

	}

}

/*
 * try {
 * t1.join();
 * } catch (InterruptedException e) {
 * 
 * }
 * 
 * t2.start();
 */
