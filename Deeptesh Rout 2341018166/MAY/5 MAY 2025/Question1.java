
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Running thread running");

	}
}

public class Question1 {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
