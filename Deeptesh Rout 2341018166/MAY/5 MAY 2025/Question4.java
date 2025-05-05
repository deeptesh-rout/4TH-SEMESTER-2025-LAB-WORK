
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running using Thread class ");
	}
}

public class Question4 {
	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();
		System.out.println("Main thread finished");
	}

}
