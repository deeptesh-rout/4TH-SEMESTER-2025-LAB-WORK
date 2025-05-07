
//Question 4
public class PriorityDemo extends Thread {

	public void run() {
		System.out.println(getName() + " with priority " + getPriority());
	}

	public static void main(String[] args) {
		PriorityDemo t1 = new PriorityDemo();
		PriorityDemo t2 = new PriorityDemo();
		PriorityDemo t3 = new PriorityDemo();
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
