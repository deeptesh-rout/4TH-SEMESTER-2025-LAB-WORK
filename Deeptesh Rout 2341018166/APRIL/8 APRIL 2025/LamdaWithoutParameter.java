
public class LamdaWithoutParameter {

	interface Announcement {
		String announce();
	}

	public static void main(String[] args) {

		Announcement a = () -> "The flight to NewYork is cancelled due to weather";
		System.out.println(a.announce());
	}

}
