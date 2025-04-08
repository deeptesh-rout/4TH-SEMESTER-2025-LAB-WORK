
public class ThreadWithLambda {

	public static void main(String[] args) {
		Runnable task = () -> System.out.println("Thread is running using Lambda");
		new Thread(task).start();

	}

}
