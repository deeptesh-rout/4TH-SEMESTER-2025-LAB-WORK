
// Question 2
public class Mythreading extends Thread {

	public void run() {
		System.out.println("Thread method is being executed.. ");
	}

	public static void main(String[] args) {
		Mythreading t2 = new Mythreading();
		t2.run();

	}

}
