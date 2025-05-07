
public class StopDemo extends Thread {
	volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Thread running ");
		}

		System.out.println("Thread stopped safely ");
	}

	public static void main(String[] args) throws InterruptedException {
		StopDemo t1 = new StopDemo();
		t1.start();
		Thread.sleep(1000);
		t1.running = false;

	}

}
