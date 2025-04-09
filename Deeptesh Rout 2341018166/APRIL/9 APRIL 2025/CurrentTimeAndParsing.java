
import java.time.LocalTime;

public class CurrentTimeAndParsing {

	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.parse("10:15"));
		System.out.println(LocalTime.of(3, 20));

	}

}
