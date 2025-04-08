public class LambdaWithSingleParameter {

	interface Announcement {
		String announce(String message);
	}

	public static void main(String[] args) {
		Announcement a1 = (msg) -> "Announcement" + msg;
		System.out.println(a1.announce("Flight to new york is cancelled "));

		Announcement a2 = (msg) -> "Alert" + msg;
		System.out.println(a2.announce("Flight to boston is cancelled "));

	}

}
