
public class ThreadGroupExample implements Runnable {
	// Question 5

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("My Group");
		Thread t1 = new Thread(group, new ThreadGroupExample(), "T1");
		Thread t2 = new Thread(group, new ThreadGroupExample(), "T2");
		Thread t3 = new Thread(group, new ThreadGroupExample(), "T3");
		t1.start();
		t2.start();
		t3.start();

		System.out.println("Thread Group example " + group.getName());
		group.list();
	}

}
