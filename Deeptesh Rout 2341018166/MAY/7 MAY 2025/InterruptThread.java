
// question 3
public class InterruptThread extends Thread {

	public void run() {

		try {
			Thread.sleep(2000);
			System.out.println("Thread is completed " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			System.out.println("Thread was interruptes " + Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {
		InterruptThread t1 = new InterruptThread();
		InterruptThread t2 = new InterruptThread();

		t1.start();
		t2.start();

		t2.interrupt();

	}

}
