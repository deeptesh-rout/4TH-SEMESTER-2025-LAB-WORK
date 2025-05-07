
// Question 3
public class MultiThreading extends Thread {

	public void run() {
		System.out.println("Running thread " + getName());
	}

	public static void main(String[] args) {
		MultiThreading t3 = new MultiThreading();
		t3.setName("My-Thread 1");
		t3.start();
	}

}
