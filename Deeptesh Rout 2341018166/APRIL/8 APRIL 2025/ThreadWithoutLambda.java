
public class ThreadWithoutLambda {

	public static void main(String[] args) {
		Runnable task = new Runnable() {
			public void run() {
				System.out.println("Thread is running ");
			}
		};

		new Thread(task).start();

	}

}
