
class Counter {
	private int count = 0;

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class RaceConditionExample extends Thread {
	private Counter counter;

	public RaceConditionExample(Counter c) {
		counter = c;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}

	public static void main(String args[]) throws Exception {
		Counter c = new Counter();
		Thread t1 = new RaceConditionExample(c);
		Thread t2 = new RaceConditionExample(c);

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final Count : " + c.getCount());

	}
}
