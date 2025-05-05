
class myRunnable implements Runnable {

	String threadName;

	myRunnable(String name) {
		this.threadName = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(threadName + " -Count " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(threadName + " was interrupted");
			}
		}

		System.out.println(threadName + " finished");
	}

}

public class Question5 {

	public static void main(String[] args) {
		myRunnable runnable1 = new myRunnable("Thread 1");
		myRunnable runnable2 = new myRunnable("Thread 2");

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();

		System.out.println("Main thread started with both thread ");

	}
}
