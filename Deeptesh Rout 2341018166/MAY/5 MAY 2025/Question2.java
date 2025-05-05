
class myRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running using Runnable interface");
	}
}

public class Question2 {

	public static void main(String[] args) {
		myRunnable myrunnable = new myRunnable();
		Thread thread = new Thread(myrunnable);
		thread.start();
		System.out.println("Thread has stopped");

	}

}
